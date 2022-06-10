class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n=s.size();
        if(n==0)
            return 0;
        unordered_map<char, int> mp;
        int cnt=0;
        int min=INT_MIN;
        
        int i=0,j=0;
        
        while(i<=n-1 and j<=n-1){
         if(mp[s[j]]==0 or mp[s[j]]<i+1 ){
             cnt=j-i+1;
            
         }
            
        else if(mp[s[j]]>0 and mp[s[j]]< j+1){
            i=mp[s[j]];
          
        }
            mp[s[j]]=j+1;
            min=max(min,cnt);
            j++;
        }
        
        return min;
    }
};