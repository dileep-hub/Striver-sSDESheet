class Solution {

    
    public int uniquePaths(int m, int n) {

        int[][] arr = new int[m][n];
        for(int[] i : arr) {
            Arrays.fill(i, -1);
        }
        return helper(0,0, m,n, arr);
        
    }
    
    public static int helper (int i, int j, int m, int n, int[][] arr) {
        
        if(i == m-1 && j == n-1) return 1;
        if(i >= m || j >= n ) return 0;
        
        if(arr[i][j] != -1) return arr[i][j];
        
        return arr[i][j] =  helper(i+1, j, m,n, arr) + helper(i,j+1, m, n, arr);
        
    }
  
//   Input: m = 3, n = 7
// Output: 28
// Example 2:

// Input: m = 3, n = 2
// Output: 3
// Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Down -> Down
// 2. Down -> Down -> Right
// 3. Down -> Right -> Down
