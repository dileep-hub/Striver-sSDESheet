class Solution {
    public int findDuplicate(int[] nums) {
        

        
int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
        
    }
    
}

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3

