class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();

        HashMap<Character,Character>mpS = new HashMap<>();
        HashMap<Character,Character>mpT = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mpS.containsKey(s.charAt(i))){
                if(mpS.get(s.charAt(i))!= t.charAt(i))
                    return false;
            }
            if(mpT.containsKey(t.charAt(i))){
                if(mpT.get(t.charAt(i))!= s.charAt(i))
                    return false;
            }
            mpS.put(s.charAt(i),t.charAt(i));
            mpT.put(t.charAt(i),s.charAt(i));
        }

        return true;
        
    }
}