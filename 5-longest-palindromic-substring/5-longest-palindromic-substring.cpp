class Solution {
public:
    string help(string s){
        string ans="";
        int n=s.size();
        bool dp[n+1][n+1];
        memset(dp,false,sizeof(dp));
        
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        
        for(int i=0;i<n-1;i++){
            if(s[i]==s[i+1]){
                dp[i][i+1]=true;
            }
        }
        
        for(int len=3;len<=n;len++){
            for(int i=0,j=len-1;j<n;i++,j++){
                if(s[i]==s[j]){
                    dp[i][j]=dp[i][j]|dp[i+1][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        
        int c=0,r=0;
        int size=1;
        
        for(int i=0;i<n;i++){
            if(dp[i][i]){
               for(int j=i;j<n;j++){
                   if(dp[i][j]){
                       if(size<(j-i+1)){
                          size=j-i+1;
                          c=j;
                          r=i;
                       }
                      
                   }
               } 
            }
        }
      
       
        for(int i=r; i<=c;i++){
            ans+=s[i];
        }
        
       
        return ans;
        
    }
    string longestPalindrome(string s) {
    
        int n=s.size();
        
        string ans=help(s);
        return ans;
    }
};