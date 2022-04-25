class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int ans=0;
        
        for(int i:nums){
            if(set.contains(i)){
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
        
        for(Integer i:set){
            ans=i;
        }
        
        return ans;
        
    }
}