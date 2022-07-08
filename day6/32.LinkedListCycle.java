/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
     
        if(head == null || head.next==null) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!= null && fast.next.next!=null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) return true;
        
    }
        return false;
}
}


// ListNode slow = head;
//         ListNode fast = head;
        
//         while(slow != fast && slow != null || fast != null) {
            
//             slow = slow.next;
//             fast = fast.next.next;
            
//             if(slow == fast) return true;
//         }


// Example 1:


// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
// Example 2:


// Input: head = [1,2], pos = 0
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
// Example 3:


// Input: head = [1], pos = -1
// Output: false
// Explanation: There is no cycle in the linked list.
