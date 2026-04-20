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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode h = head;
        int count = 0;
        while(h!= null){
            ListNode tmp = h.next;
            h.next = prev;
            prev = h;
            h = tmp;
        }
        h = prev;
        
        if(n == 1){
            prev = h.next;
        }else{
            count = 1;
            while(h != null && count < n-1){
                h = h.next;
                count++;
            }
            if(h != null && h.next != null){
                h.next = h.next.next;
            }
        }

        h = prev;
        prev = null;
        while(h != null){
            ListNode tmp = h.next;
            h.next = prev;
            prev = h;
            h = tmp;
        }

        return prev;
    }
}
