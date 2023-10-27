class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>>ansList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i!=0 && nums[i-1]==nums[i])
                continue;
            
            int j = i+1, k = n-1;

            while(j<k){
               int sum = nums[i]+nums[j]+nums[k];
               if(sum>0){
                   k--;
               }
               else if(sum<0){
                   j++;
               }
               else{
                   ansList.add(Arrays.asList(nums[i],nums[j],nums[k]));
                   j++;
                   k--;
                   while(j<k && nums[j-1]==nums[j]) j++;
                   while(k<k && nums[k+1]==nums[k])k--;
               }
            }
        }

        return ansList;
    }
}