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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            sum += carry;
            dummy.next = new ListNode(sum%10);
            carry = sum/10;
            dummy = dummy.next;
        }
        
        return res.next;
        
    }
}


// int carry = 0;
//         ListNode list = new ListNode(0);
//         ListNode resList = list;
        
//         while(l1 != null || l2 != null || carry != 0) {
            
//             int sum = 0;
            
//             if(l1 != null) {
//                 sum += l1.val;
//                 l1 = l1.next;
//             }
//             if(l2 != null) {
//                 sum += l2.val;
//                 l2 = l2.next;
//             }            
            
//             sum += carry;
//             carry = sum/10;
//             ListNode nnode = new ListNode(sum%10);
//             list.next = nnode;
//             list = list.next;
            
//         }
//         return resList.next;


// Your input
// [2,4,3]
// [5,6,4]
// [0]
// [0]
// [9,9,9,9,9,9,9]
// [9,9,9,9]
// Output
// [7,0,8]
// [0]
// [8,9,9,9,0,0,0,1]
// Expected
// [7,0,8]
// [0]
// [8,9,9,9,0,0,0,1]
