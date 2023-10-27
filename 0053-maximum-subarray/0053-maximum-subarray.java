class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curr=0, maxSum=0;
        int maxNum = Integer.MIN_VALUE;
        boolean allNegative = true;

        for(int i=0;i<n;i++){
            maxNum = Math.max(maxNum,nums[i]);
            curr += nums[i];
            if(curr<0){
                curr = 0;
            }
            else{
                allNegative=false;
            }
            maxSum = Math.max(curr,maxSum);
        }
        if(allNegative)
            return maxNum;
        return maxSum;
        
    }
}
/*
    maxSum = 0;
    -2,1,-3,4,-1,2,1,-5,4
    max 0. curr 0
    max 1 curr 1
    max 1  curr 0
    max 4 curr 4
    max 0 curr 3
    max 5 curr 5
    max 6 curr 6
    max 6 curr 1
    max 6 curr 5
 */