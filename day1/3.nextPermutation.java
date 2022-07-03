class Solution {
    public void nextPermutation(int[] nums) {

        if(nums == null || nums.length <= 1) return;
        
        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]) i--;
        
        if(i >= 0) {
        for(int j=nums.length-1; j>i; j--) {
            if(nums[j] > nums[i]) {
                swap(nums, i, j);
                break;
            }
        }
        }
        reverse(nums, i+1, nums.length-1);  
    }  
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    public void reverse(int[] nums, int i, int j) {
        while(i<j) {
            swap(nums, i++, j--);
        }
    }
    
    }

// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]
// Example 2:

// Input: nums = [3,2,1]
// Output: [1,2,3]
// Example 3:

// Input: nums = [1,1,5]
// Output: [1,5,1]
