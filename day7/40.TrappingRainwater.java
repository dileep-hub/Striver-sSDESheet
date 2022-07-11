class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        if(n<2) return 0;
        
        int ans = 0;
        
        int[] suf = new int[n]; // to find the left max
        suf[0] = height[0];
        for(int i=1; i<n; i++) {
            suf[i] = Math.max(suf[i-1], height[i]);
        }
        
        int[] pre = new int[n]; // to find the right max
        pre[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            pre[i] = Math.max(pre[i+1], height[i]);
        }
        
        for(int i=1; i<n-1; i++) {
            if(height[i]<suf[i-1] && height[i] < pre[i+1] ) {
                ans += (Math.min(suf[i-1], pre[i+1])-height[i]);
            }
        }
        return ans;
    }
}

// Accepted
// Runtime: 0 ms
// Your input
// [0,1,0,2,1,0,1,3,2,1,2,1]
// [4,2,0,3,2,5]
// stdout
// [0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
// [4, 4, 4, 4, 4, 5]

// Output
// 6
// 9
// Expected
// 6
// 9
