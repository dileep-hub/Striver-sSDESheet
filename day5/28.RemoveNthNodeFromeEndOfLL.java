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
        
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        for(int i=0; i<n; i++) {
            fast = fast.next;
        }
        
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
        
        
    }
}


// ListNode slow = new ListNode();
//         slow.next = head;
//         ListNode res = slow;
//         ListNode fast = head;
            
//         for(int i=1; i<n; i++) {
//             fast = fast.next;
//         }
        
//         while(fast.next != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }
        
//         slow.next = slow.next.next;
//         return res.next;

// Your input
// [1,2,3,4,5]
// 2
// Output
// [1,2,3,5]
// Expected
// [1,2,3,5]
