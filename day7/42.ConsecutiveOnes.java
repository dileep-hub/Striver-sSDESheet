class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                if(count > max) max = count;
            } else count=0;
            
        }
        return max;
    }
}

// Accepted
// Runtime: 0 ms
// Your input
// [1,1,0,1,1,1]
// [1,0,1,1,0,1]
// [0,0]
// [0]
// Output
// 3
// 2
// 0
// 0
// Expected
// 3
// 2
// 0
// 0
