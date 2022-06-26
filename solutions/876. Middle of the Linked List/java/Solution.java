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
    
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        while (head.next != null) {
            middle = middle.next;
            if (head.next != null && head.next.next != null)
                head = head.next.next;
            else
                head = head.next;
        }
        return middle;
    }
    
}
