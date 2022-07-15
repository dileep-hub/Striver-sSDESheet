class Solution {
    
    public void permute(int ind, int[] nums, List<List<Integer>> res) {
        
        if(ind == nums.length) {
            List<Integer> arr = new ArrayList<>();
            for(int i=0 ;i<nums.length; i++) {
                arr.add(nums[i]);
            }
            res.add(arr);
            return;
        }
        
        for(int i=ind; i<nums.length; i++) {
            swap(i, ind, nums);
            permute(ind+1, nums, res);
            swap(i, ind, nums);
        }
    }
    
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        permute(0, nums, res);
        return res;
        
    }
    
    
    
    
}
