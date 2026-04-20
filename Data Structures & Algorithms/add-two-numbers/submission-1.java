/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0, sum1 = 0, sum2 = 0, total = 0;
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;

        while(l1 != null && l2 != null){
            sum1 += l1.val * (int) Math.pow(10,count);
            sum2 += l2.val * (int) Math.pow(10,count);
            count++;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 != null && l2 == null){
            while(l1 != null){
                sum1 += l1.val * (int) Math.pow(10,count);
                count++;
                l1 = l1.next;
            }
        }else{
            while(l2 != null){
                sum2 += l2.val * (int) Math.pow(10, count);
                count++;
                l2 = l2.next;
            }
        }

        total = sum1 + sum2;

        if(total == 0){
            return new ListNode(0);
        }

        
        while(total != 0){
            ptr.next = new ListNode(total%10);
            total /= 10;
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
