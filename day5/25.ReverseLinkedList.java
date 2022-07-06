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
        
        ListNode dummy = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
    }
}

// ListNode newHead = null;
//         while(head != null) {
//             ListNode next = head.next;
//             head.next = newHead;
//             newHead = head;
//             head = next;
//         }
        
//         return newHead;

// Your input
// [1,2,3,4,5]
// [1,2]
// []
// Output
// [5,4,3,2,1]
// [2,1]
// []
// Expected
// [5,4,3,2,1]
// [2,1]
// []
