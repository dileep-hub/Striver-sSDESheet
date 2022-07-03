class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> prevL = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> subL = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j == 0 || j==i) {
                    subL.add(1);
                } else {
                    subL.add(prevL.get(j-1) + prevL.get(j));
                }
            }
            res.add(subL);
            prevL = subL;
        }
        return res;
    }
}

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
