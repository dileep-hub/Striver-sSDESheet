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
        
        
        
//         int[] arrc = new int[matrix[0].length];
//         int[] arrr = new int[matrix.length];
        
//         int cl = matrix[0].length;
//         int rl = matrix.length;
        
//         for(int i=0; i<rl; i++) {
//             for(int j=0; j<cl; j++) {
//                 if(matrix[i][j] == 0) {
//                     arrc[j] = -1;
//                     arrr[i] = -1;
//                 }
//             }
//         }
        
//         for(int i=0; i<rl; i++) {
//             for(int j=0; j<cl; j++) {
//                 if(arrc[j] == -1 || arrr[i] == -1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
    }
}

// Accepted
// Runtime: 0 ms
// Your input
// [[1,1,1],[1,0,1],[1,1,1]]
// Output
// [[1,0,1],[0,0,0],[1,0,1]]
// Expected
// [[1,0,1],[0,0,0],[1,0,1]]
