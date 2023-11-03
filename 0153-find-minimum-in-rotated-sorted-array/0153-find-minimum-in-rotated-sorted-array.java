class Solution {
    private int rotatedBinarySearch(int []nums, int n){
        int start=0,end=n-1;
        int ans = Integer.MAX_VALUE;

        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]>=nums[start]){
                ans = Math.min(ans,nums[start]);
                start = mid+1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                end = mid-1;
            }
        }
        return ans;
    }
    public int findMin(int[] nums) {
        int n = nums.length;

        return rotatedBinarySearch(nums,n);
    }
}