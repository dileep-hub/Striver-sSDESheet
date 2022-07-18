class Solution {
    public int[] sortArray(int[] nums) {
        
        // Arrays.sort(nums);
        // return nums;
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int ele : nums) {
            minheap.add(ele);
        }
        
        for(int i=0; i<nums.length; i++) {
            nums[i] = minheap.poll();
        }
        return nums;
        
    }
}
