class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;

       int majorElement = nums[0];
       int majorCount = 0;

       for(int i=0;i<n;i++){
           if(nums[i]== majorElement)
                majorCount++;

            else{
                majorCount--;
            }
            if(majorCount == 0){
                majorElement = nums[i];
                majorCount = 1;
            }
       }

       int countCheck = 0;
       for(int i: nums){
           if(i == majorElement){
               countCheck++;
           }
       } 
       if(countCheck>n/2)
        return majorElement;
       
       return -1;
    }
}