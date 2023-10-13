class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>>ansList = new ArrayList<>();
        Set<List<Integer>>uniqueList = new HashSet<>();

        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k = n-1;
            int target = 0-nums[i];
            
            while(j<n && k>i && j<k){
                ArrayList<Integer> ans = new ArrayList<>();
                if(nums[j]+nums[k]==target){
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    uniqueList.add(ans);             
                    j++;
                }
                else if(nums[j]+nums[k]>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }

        for(List<Integer>ul:uniqueList){
            ansList.add(ul);
        }

        return ansList;

    }
}