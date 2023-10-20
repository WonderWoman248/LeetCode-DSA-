class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;
        int productWoZero = 1;

        for(int i:nums){
            if(i != 0){
                productWoZero *= i;
            }
            else{
                zeroCount++;
            }
        }

        int[]ans = new int[n];
        for(int i=0;i<n;i++){
            if(zeroCount == 1){
                if(nums[i]!=0){
                    ans[i]=0;
                }
                else{
                    ans[i]=productWoZero;
                }
            }
            else if(zeroCount>1){
                ans[i]=0;
            }
            else{
                ans[i] = productWoZero/nums[i];
            }
        }

        return ans;
    }
}