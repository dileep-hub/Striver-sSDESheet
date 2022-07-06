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
        

        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
        
        
    }
}

// ListNode one = head;
//         ListNode two = head;
        
//         while(two != null && two.next != null ) {
//             one = one.next;
//             two = two.next.next;
//         }
//         return one;

// Your input
// [1,2,3,4,5]
// [1,2,3,4,5,6]
// Output
// [3,4,5]
// [4,5,6]
// Expected
// [3,4,5]
// [4,5,6]
