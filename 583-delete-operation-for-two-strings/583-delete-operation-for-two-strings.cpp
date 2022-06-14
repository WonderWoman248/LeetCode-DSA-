class Solution {
public:
   int dp[501][501];
    
   int lcs(string word1, string word2, int n, int m){
       if(n == 0 or m == 0)
           return 0;
       if(dp[n][m]!=-1)
           return dp[n][m];
       
      if(word1[n-1]==word2[m-1])
          return dp[n][m]=1+lcs(word1, word2,n-1,m-1);
       
       else
           return dp[n][m]=max(lcs(word1,word2,n-1,m),lcs(word1,word2,n,m-1));
   }
    int minDistance(string word1, string word2) {
        
        for(int i=0;i<501;i++){
            for(int j=0;j<501;j++){
                dp[i][j]=-1;
            }
        }
        int n=word1.size();
        int m=word2.size();
        
        int ans;
        ans=lcs(word1,word2,n,m);
        
        int res=0;
        res=(n-ans)+(m-ans);
        
        return res;
        
    }
};