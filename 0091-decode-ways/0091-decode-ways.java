class Solution {
    int[]dp = new int[101];
    public int numDecodings(String s) {
        Arrays.fill(dp,-1);
        return decode(s,0);
        
    }
    public int decode(String s,int index){
        int n = s.length();
        if(index == n)
            return 1;
    

        if(s.charAt(index)=='0')
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        else{
            int takeOne = decode(s,index+1);
            if(index == n-1)
                return dp[index] = takeOne;
            String two = s.substring(index,index+2);
            int valTwo = Integer.parseInt(two);
            if(valTwo>26)
                return dp[index]=takeOne;
           
            int takeTwo = decode(s,index+2);
            return dp[index] = takeOne+takeTwo;
               
        }
    }
}