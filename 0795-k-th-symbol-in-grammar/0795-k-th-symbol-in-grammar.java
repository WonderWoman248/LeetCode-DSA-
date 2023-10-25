class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1)
            return 0;
        double length = Math.pow(2,n-2);

        if(k<= length)
            return kthGrammar(n-1,k);
        else
            return 1 - kthGrammar(n-1,k-(int)length);
       
    }
    
//     //
//     0
//     01
//     0110
//     01101001
//     0110100110010110

//    n = 30
//    n * 2^(n-1)
    
}