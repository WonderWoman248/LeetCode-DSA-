class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>common=new HashSet<>();
        
        for(int i:nums1){
            set1.add(i);
        }
        
        for(int i:nums2){
            if(set1.contains(i)){
                common.add(i);
            }
        }
        
        int []ans=new int[common.size()];
        
        int idx=0;
        
        for(Integer i:common){
            ans[idx++]=i;
        }
        return ans;
        
    }
}