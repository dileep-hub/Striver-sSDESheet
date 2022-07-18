class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(arr.length,(o1,o2)->
        {
               if(Math.abs(o1-x)==Math.abs(o2-x)) 
               {
                   if(o1>o2) return -1;
                   return 1;
               }
               else if(Math.abs(o1-x)>Math.abs(o2-x)) return -1;  
               else return 1;
        });
        
        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int n:arr)
        {
            pq.add(n);
            if(pq.size()>k) pq.remove();
        }
        
        System.out.println(pq);
        
        List<Integer> result = new ArrayList<>();
        while(pq.size()>0) result.add(pq.remove());
        // System.out.println(result);
        Collections.sort(result);
        return result;
    
        
    }
}
