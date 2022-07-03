class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] helper = new int[m+n];
        
        for(int i=0; i<m; i++) {
            helper[i] = nums1[i];
        }
        
        for(int i=0; i<n; i++ ) {
            helper[i+m] = nums2[i];
        }
        
        Arrays.sort(helper);

        for(int i=0; i<m+n; i++) {
            nums1[i] = helper[i];
        }
//         for(int i=0; i<n; i++) {
//             nums1[i+m] = nums2[i];
//         }
        
//         Arrays.sort(nums1);
    }
}


// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

