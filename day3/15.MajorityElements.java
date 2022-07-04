class Solution {
    public int majorityElement(int[] nums) {
        
        // Moode ALgorithm
        
//         int count = 0;
//         int maj = nums[0];
        
//         for(int ele : nums) {
//             if(count == 0) {
//                 maj = ele;
//                 count=1;;
//             } else {
//                 if(ele == maj) count++;
//                 else count--;
//             }
//         }
//         return maj;
        
      
//       using HashMap
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int ele : nums) {
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                map.put(ele, map.get(ele)+1);
            }
            if(map.get(ele) > nums.length/2) {
                res = ele;
            }
        }
        
        return res;
        
    }
}

// Your input
// [3,2,3]
// [2,2,1,1,1,2,2]
// Output
// 3
// 2
// Expected
// 3
// 2
