class Solution {
public:
    bool allSame(string s){
        if(s[0]==s[1] and s[1]==s[2])return true;
        return false;
    }
    string largestGoodInteger(string num) {
        int n=num.length();
        string ans="";
        for(int i=0;i<n;i++){
            string subString=num.substr(i,3);
            if(allSame(subString)){
                ans=max(ans,subString);
            }
            
        }
        return ans;
        
    }
};