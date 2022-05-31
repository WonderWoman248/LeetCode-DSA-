class Solution {
public:
    bool hasAllCodes(string s, int k) {
        set<string>binaryCodes;
        
        int totalCodesPossible=pow(2,k);
        for(int i=0;i<s.length();i++){
            string temp=s.substr(i,k);
            if(temp.length()==k)
                binaryCodes.insert(temp);
            
        }
        
        return binaryCodes.size()>=totalCodesPossible;
        
    }
};