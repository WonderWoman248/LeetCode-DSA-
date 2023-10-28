class Solution {
    int []dp = new int[101];
    public int rob(int[] nums) {
        Arrays.fill(dp,-1);
        int n = nums.length;
        return maxPossible(nums,n,0);
    }
    private int maxPossible(int[]nums, int n, int i){
        if(i>=n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int taken = nums[i]+maxPossible(nums,n,i+2);
        int notTaken = maxPossible(nums,n,i+1);
        return dp[i]=Math.max(taken,notTaken);
    }

}