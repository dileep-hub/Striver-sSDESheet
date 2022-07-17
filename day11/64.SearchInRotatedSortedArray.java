class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            
            
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid-1;
                } else low = mid+1;
            } else {
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid+1;
                } else high = mid-1;
            }
        }
        return -1;
    }
}


// Your input
// [4,5,6,7,0,1,2]
// 0
// [4,5,6,7,0,1,2]
// 3
// [1]
// 0
// [4,5,6,7,0,1,2]
// 3
// Output
// 4
// -1
// -1
// -1
// Expected
// 4
// -1
// -1
// -1
