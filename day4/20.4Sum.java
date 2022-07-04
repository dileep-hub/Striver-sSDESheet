class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums == null || nums.length == 0) return res;
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                
                int target2 = target - nums[i] - nums[j];
                int left = j+1;
                int right = n-1;
                
                while(left < right) {
                    
                    int twoSum = nums[left] + nums[right];
                    if(twoSum < target2) left++;
                    else if (twoSum > target2) right--;
                    else {
                        List<Integer> cort = new ArrayList<>();
                        cort.add(nums[i]);
                        cort.add(nums[j]);
                        cort.add(nums[left]);
                        cort.add(nums[right]);
                        res.add(cort);
                        
                        while(left < right && nums[left] == cort.get(2)) left++;
                        
                        while(left < right && nums[right] == cort.get(3)) right--;
                    }
                    
                }
                
                while(j + 1 < n && nums[j+1] == nums[j]) j++; 
                
            }
            while(i + 1 < n && nums[i+1] == nums[i]) i++;
        }
        
        return res;
        
    }
}

// Your input
// [1,0,-1,0,-2,2]
// 0
// [2,2,2,2,2]
// 8
// [1000000000,1000000000,1000000000,1000000000]
// -294967296
// Output
// [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// [[2,2,2,2]]
// []
// Expected
// [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// [[2,2,2,2]]
// []
