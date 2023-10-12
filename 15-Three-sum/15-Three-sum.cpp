class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int j = i + 1;
        int k = nums.length - 1;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        while(i < nums.length - 2){
            int num = nums[i];
            j = i + 1;
            k = nums.length - 1;
            int sum = 0 - nums[i];
            while(j < k ){
                if(nums[j] + nums[k] == sum){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    while(j<k && nums[j] == nums[j+1]){
                        j++;
                    }
                    j++;
                    k--;
                }
                else if(nums[j] + nums[k] > sum){
                    k--;
                }
                else{
                    j++;
                }
            }
            while(i< nums.length - 2 && nums[i] == num){
                i++;
            }

        }

        return res;
    }
}