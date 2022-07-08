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
    public boolean isPalindrome(ListNode head) {
        
        Stack<ListNode> stk=new Stack<>();
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            stk.push(temp);
            temp=temp.next;
        }
        
        while(head!=null && !stk.isEmpty())
        {
            if(stk.pop().val != head.val)
            {
                return false;
            }
            head=head.next;
        }
        
        return true;
    }
}

// ListNode slow = head;
//         ListNode fast = head;
        
//         while(fast.next != null && fast.next.next!= null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//         slow.next = reverse(slow.next);
        
//         ListNode c = slow.next;
//         while(c!=null) {
//             System.out.println(c.val);
//             c= c.next;
//         }
        
//         slow = slow.next;
        
//         ListNode check = head;
        
//         while(slow != null) {
//             if(check.val != slow.val) return false;
//             check = check.next;
//             slow = slow.next;
//         }
        
//         return true;
//     }
    
//     public ListNode reverse(ListNode head) {
//         ListNode dummy = null;
//         ListNode next = null;
//         while(head != null) {
//             next = head.next;
//             head.next = dummy;
//             dummy = head;
//             head = next;
//             // next = next.next;
//         }
//         return dummy;
//     }


// Example 1:


// Input: head = [1,2,2,1]
// Output: true
// Example 2:


// Input: head = [1,2]
// Output: false
