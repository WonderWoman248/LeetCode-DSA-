class Solution {
public:
    int removePalindromeSub(string s) {
      int i=0,j=s.size()-1;
        
        while(i<s.size() and j>=0){
            if(s[i]!=s[j]) return 2;
            i++;
            j--;
        }
        return 1;
        
    }
};