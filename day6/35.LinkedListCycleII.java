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
    public ListNode detectCycle(ListNode head) {
        
        ListNode dummy = head;
        
        if(head == null || head.next==null || head.next.next == null) return null;
    
        
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        
        
        
        while(slow != fast ) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == null || fast == null || fast.next == null) return null;
        }
        
        // System.out.println(slow.val);
        
        while(dummy != slow) {
            dummy = dummy.next;
            slow = slow.next;
        }
        
        return slow;
        
    }
}

// Your input
// [3,2,0,-4]
// 1
// [1,2]
// 0
// [1]
// -1
// Output
// tail connects to node index 1
// tail connects to node index 0
// no cycle
// Expected
// tail connects to node index 1
// tail connects to node index 0
// no cycle
