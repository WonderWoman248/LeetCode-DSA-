class Solution {
public:
    int removePalindromeSub(string s) {
      string k=s;
      reverse(k.begin(),k.end());
        
        int count=0,countA=0, countB=0;
        
        for(int i=0;i<s.size();i++){
            if(s[i]!=k[i])count++;
            if(s[i]=='a')countA++;
            if(s[i]=='b')countB++;
        }
        
        if(count==0)return 1;
        
        else if(countA==s.size() or countB==s.size()) return 1;
        
        else return 2;
        
    }
};