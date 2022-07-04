class Solution {
    public double myPow(double x, int n) {
        
        double ans  = 1.0;
        long n1 = n;
        
        if(n1 < 0) n1=-1*n1;
        
        while(n1!=0) {
            if(n1%2 == 0){
                x = x*x;
                n1 = n1/2;
            } else {
                ans = ans * x;
                n1--;
            }
        }
        
        if(n<0) return 1/ans;
        
        return ans;
        
    }
}

// Your input
// 2.00000
// 10
// 2.10000
// 3
// 2.00000
// -2
// 1.00000
// 2147483647
// Output
// 1024.00000
// 9.26100
// 0.25000
// 1.00000
// Expected
// 1024.00000
// 9.26100
// 0.25000
// 1.00000
