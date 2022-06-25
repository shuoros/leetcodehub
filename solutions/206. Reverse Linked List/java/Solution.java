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
    
    public ListNode reverseList(ListNode head) {
        ListNode reversed = new ListNode();
        while (head != null){
            ListNode tmp = new ListNode();
            reversed.val = head.val;
            tmp.next = reversed;
            reversed = tmp;
            head = head.next;
        }
        return reversed.next;
    }
    
}
