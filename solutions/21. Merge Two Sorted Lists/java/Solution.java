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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode;
        if (list1 != null && list2 != null) {
            ListNode nextNode;
            if(list1.val <= list2.val){
                newNode = new ListNode(list1.val);
                nextNode = mergeTwoLists(list1.next, list2);
            } else{
                newNode = new ListNode(list2.val);
                nextNode = mergeTwoLists(list1, list2.next);
            }
            if (nextNode != null)
                newNode.next = nextNode;
            return newNode;
        } else if (list1 != null && list2 == null) {
            newNode = new ListNode(list1.val);
            ListNode nextNode = mergeTwoLists(list1.next, null);
            if (nextNode != null)
                newNode.next = nextNode;
            return newNode;
        } else if (list2 != null && list1 == null) {
            newNode = new ListNode(list2.val);
            ListNode nextNode = mergeTwoLists(null, list2.next);
            if (nextNode != null)
                newNode.next = nextNode;
            return newNode;
        }
        return null; // list1 == null && list2 == null
    }
    
}
