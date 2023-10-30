class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mp= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            mp.put(magazine.charAt(i),mp.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            if(!mp.containsKey(ransomNote.charAt(i)))
                return false;
            if(mp.get(ransomNote.charAt(i))==0)
                return false;
            mp.put(ransomNote.charAt(i),mp.get(ransomNote.charAt(i))-1);
        }
        return true;
    }
}