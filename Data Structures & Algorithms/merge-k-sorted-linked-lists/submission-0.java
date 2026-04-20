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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null){
            return null;
        }

        while(lists.length > 1){
            List<ListNode> mergeLists = new ArrayList<>();
            for(int i=0; i < lists.length; i+=2){
                ListNode list1 = lists[i];
                ListNode list2 = (i+1) < lists.length ? lists[i+1] : null;
                mergeLists.add(mergedList(list1,list2)); 
            }
            lists = mergeLists.toArray(new ListNode[0]);
        }

        return lists[0];
    }

    public ListNode mergedList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                node.next = l1;
                l1 = l1.next;
            }else{
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }

        if(l2 != null){
            node.next = l2;
        }

        if(l1 != null){
            node.next = l1;
        }

        return dummy.next;
    }
}
