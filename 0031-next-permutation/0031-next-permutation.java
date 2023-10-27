class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int changingIndex = -1;
        for(int i= n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                changingIndex = i;
                break;
            }
        }
        if(changingIndex == -1)
            reverseArray(nums,0,n-1);
        else{
            int minIndex = -1;
            int minEle = Integer.MAX_VALUE;
            for(int i=n-1;i>changingIndex;i--){
                if(nums[i]>nums[changingIndex]){
                    if(nums[i]< minEle){
                        minIndex= i;
                        minEle = nums[i];
                    }
                }
            }
            int temp = nums[changingIndex];
            nums[changingIndex] = nums[minIndex];
            nums[minIndex] = temp;
            reverseArray(nums,changingIndex+1,n-1);
        }
        

    }

    private void reverseArray(int []nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}