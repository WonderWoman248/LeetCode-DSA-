class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        
        for(int i: nums){
            set.add(i);
        }
        
        return set.size()<n;
        
    }
}