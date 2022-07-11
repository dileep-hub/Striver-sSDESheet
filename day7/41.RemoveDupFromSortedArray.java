class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0;
        int j=0;
        
        while(j<nums.length) {
            if(nums[i] == nums[j]) j++;
            else if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i+1;
        
    }
}


// HashSet<Integer> map  = new HashSet<>();
        
//         for(int ele : nums) {
//             map.add(ele);
//         }
        
        
        
//         int i=0;
//         for(int ele : map) {
//             nums[i] = ele;
//             i++;
//         }
        
//         return map.size();


// Accepted
// Runtime: 0 ms
// Your input
// [1,1,2]
// [0,0,1,1,1,2,2,3,3,4]
// [-3,-1,0,0,0,3,3]
// Output
// [1,2]
// [0,1,2,3,4]
// [-3,-1,0,3]
// Expected
// [1,2]
// [0,1,2,3,4]
// [-3,-1,0,3]
