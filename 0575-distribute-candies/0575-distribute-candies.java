class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int type: candyType){
            mp.put(type,1);
        }

        if(mp.size()< n/2)
            return mp.size();
        
        return n/2;
        
    }
}