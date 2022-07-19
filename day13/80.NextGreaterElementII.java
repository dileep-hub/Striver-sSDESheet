class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        Stack<Integer> st = new Stack();
        
        for(int i=n-2; i>=0; i--) {
            while(st.size()>0 && st.peek() <= nums[i]) {
                st.pop();
            }
            st.push(nums[i]);
        }
        
        int res[] = new int[n];
        
        for(int i=n-1; i>=0; i--) {
            while(st.size()>0 && st.peek() <= nums[i]) {
                st.pop();
            }
            
            if(st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res;
    }
}
