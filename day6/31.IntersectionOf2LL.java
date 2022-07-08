/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;
        
        while(dummy1 != dummy2) {
//             dummy1 = if(dummy == null) -> headA else dummy.next;
            dummy1 = dummy1==null ? headB:dummy1.next;
            dummy2 = dummy2==null ? headA:dummy2.next;
        }
        return dummy1;
    }
}

// if(headA == null || headB == null) return null;
        
//         ListNode a = headA;
//         ListNode b = headB;
        
//         while(a != b) {
//             if(a != null) {
//                 a = a.next;
//             } else {
//                 a = headB;
//             }
//             if(b != null) {
//                 b = b.next;
//             } else {
//                 b = headA;
//             }
//         }
        
//         return a;


// Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
// Output: Intersected at '8'
// Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
// From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
