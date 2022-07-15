class Solution {

    
    public void helper(int ind, int target, List<Integer> ds, int[] cand, List<List<Integer>> res) {
        if(ind == cand.length) {
            if(target == 0){
                res.add(new ArrayList<>(ds));   
            } 
            return;
        }
        
        if(cand[ind] <= target) {
            ds.add(cand[ind]);
            helper(ind, target-cand[ind], ds, cand, res);
            ds.remove(ds.size()-1);
        }
        helper(ind+1, target, ds, cand, res);       
        
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        helper(0, target, new ArrayList<>(), candidates, res);
        return res;
        
    }
}

// Accepted
// Runtime: 0 ms
// Your input
// [2,3,6,7]
// 7
// Output
// [[2,2,3],[7]]
// Expected
// [[2,2,3],[7]]
