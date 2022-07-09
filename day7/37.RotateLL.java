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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k==0) return head;
        int len = 1;
        ListNode dummy = head;
        
        while(dummy.next != null) {
            len++;
            dummy = dummy.next;
        }
        
        dummy.next = head;
        k = k%len;
        k =  len - k;
        
        while(k>0) {
            dummy = dummy.next;
            k--;
        }
        
        head = dummy.next;
        dummy.next = null;
        
        return head;
        
    }
}

// Example 1:


// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]
// Example 2:


// Input: head = [0,1,2], k = 4
// Output: [2,0,1]
