class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        int[] arrc = new int[matrix[0].length];
        int[] arrr = new int[matrix.length];
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0) {
                    arrr[i] = -1;
                    arrc[j] = -1;
                }
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(arrr[i] == -1 || arrc[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
      
      
//       Example 2:


// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
