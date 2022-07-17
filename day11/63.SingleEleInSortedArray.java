class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low = 0;
        int high = nums.length-2;
        
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == nums[mid^1]) {
                low = mid+1;
            } else high = mid-1;
        }
        return nums[low];
    }
}


// Your input
// [1,1,2,3,3,4,4,8,8]
// Output
// 2
// Expected
// 2
