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
        
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode dummy = new ListNode();
        
        ListNode head = dummy;
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
            
            if(list1 == null) dummy.next = list2;
            if(list2 == null) dummy.next = list1;
            
        }
    return head.next;
        
        
    }
}


// ListNode head = new ListNode();
//         ListNode dummy = head;
        
//         while(list1 != null && list2 != null) {
//             if(list1.val <= list2.val) {
//                 head.next = list1;
//                 list1 = list1.next;
//             } else {
//                 head.next = list2;
//                 list2 = list2.next;
//             }
//             head = head.next;
//         }
        
//         if(list1!= null) {
//             head.next = list1;
//         } 
//         if(list2 != null) {
//             head.next = list2;
//         }
        
//         return dummy.next;

// Example 1:


// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]
