class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max = nums[0];
        
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
            if(sum > max) max = sum;
            if(sum < 0) sum=0;
        }
        return max;
    }
}

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
