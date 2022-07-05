class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int max= 0;
        
        for(int i=0; i<n; i++) {
            sum += arr[i];
            if(sum == 0) {
                max = i+1;
               // System.out.println(i + " 0 " + max);
            }
            
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }else {
                int mx = i-(map.get(sum));
                if(mx > max) max = mx;
               // System.out.println(i + " " + max);
            }
            
        }
        return max;
        
    }
}

// Input:
// N = 8
// A[] = {15,-2,2,-8,1,7,10,23}
// Output: 5
// Explanation: The largest subarray with
// sum 0 will be -2 2 -8 1 7.
