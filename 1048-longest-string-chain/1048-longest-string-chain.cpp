class Solution {
public:
    static bool compare(string &s1, string &s2){
        return s1.length() < s2.length();
    }
    int longestStrChain(vector<string>& words) {
        int ans=0;
        int n=words.size();
        sort(words.begin(),words.end(),compare);
        
        unordered_map<string,int>dp;
        
        for(int i=0;i<n;i++){
             dp[words[i]]=1;
            int maxChainPsbl=0;
            
            for(int j=0;j<words[i].size();j++){
                string temp=words[i];
                temp.erase(temp.begin()+j);
                
                if(dp.find(temp)!=dp.end()){
                   maxChainPsbl=max(maxChainPsbl,dp[temp]); 
                }
            }
            dp[words[i]]+=maxChainPsbl;
            ans=max(ans,dp[words[i]]);
        }
        
        return ans;
    }
};