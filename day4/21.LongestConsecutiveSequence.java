class Solution {
    public int longestConsecutive(int[] nums) {
        
    if(nums == null || nums.length == 0) return 0;
        
    HashSet<Integer> set = new HashSet<>();
    for(int i : nums) set.add(i);
        
        int[] arr = new int[set.size()];
        int k=0;
        for(int ele : set) {
            arr[k++] = ele;
        }
        
        Arrays.sort(arr);
        int count = 0;
        int maxc = 0;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]+1 == arr[i+1]) {
                count++;
                if(count > maxc) maxc = count;
            } else count = 0;
        }
            
        return maxc+1;
    
        
    }
}




// Set<Integer> set = new HashSet<>();
        // int maxStreak = 0;
        // for(int ele : nums) {
        //     set.add(ele);
        // }
        // for(int i=0; i<nums.length; i++) {
        //     if(!set.contains(nums[i]-1)) {
        //         int currentStreak = 0;
        //         int currentnum = nums[i];
        //         while(set.contains(currentnum++)) {
        //             currentStreak++;
        //         }
        //         if(currentStreak > maxStreak) maxStreak = currentStreak;
        //     } }
        // return maxStreak; 

// int max = 0;
//         for(int ele : nums) {
//             if(!set.contains(ele-1)) {
//                 int count = 0;
//                 int cnum = ele;
//                 while(set.contains(cnum++)) {
//                     count++;
//                     if(count > max) max = count;
//                 }
//             }
//         }
        
//         return max;


// Your input
// [100,4,200,1,3,2]
// [0,3,7,2,5,8,4,6,0,1]
// []
// Output
// 4
// 9
// 0
// Expected
// 4
// 9
// 0
