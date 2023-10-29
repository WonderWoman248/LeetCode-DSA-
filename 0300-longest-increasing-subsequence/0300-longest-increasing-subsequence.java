class Solution {
    int[][]dp = new int[2501][2501];
    public int lengthOfLIS(int[] nums) {
        for(int[]x:dp)
            Arrays.fill(x,-1);
        return lis(nums,0,-1);
        
    }
    private int lis(int[]nums,int current,int prev){
        int n = nums.length;
        if(current>=n)
            return 0;
        if(prev == -1)
            return Math.max((1+lis(nums,current+1,current)),lis(nums,current+1,prev));
        if(dp[current][prev]!=-1)
            return dp[current][prev];
        if(nums[prev] < nums[current]){
            return dp[current][prev]=Math.max((1+lis(nums,current+1,current)),lis(nums,current+1,prev));
        }
        return dp[current][prev]= lis(nums,current+1,prev);

    }
}