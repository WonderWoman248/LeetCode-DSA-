class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer>majorityElement = new ArrayList<Integer>();
        if(n==1){
             majorityElement.add(nums[0]);
             return majorityElement;
        }
           

        int firstNum=nums[0],secondNum= nums[1];
        int firstNumCount=0, secondNumCount=0;

        for(int i=0;i<n;i++){
            if(firstNumCount== 0 && nums[i]!= secondNum){
                firstNum=nums[i];
                firstNumCount++;
            }
            else if(secondNumCount== 0 && nums[i]!= firstNum){
                secondNum=nums[i];
                secondNumCount++;
            }
            else if(nums[i]==firstNum){
                firstNumCount++;
            }
            else if(nums[i]==secondNum){
                secondNumCount++;
            }
            else{
                firstNumCount--;
                secondNumCount--;
            }
        }
        int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==firstNum) count1++;
            if(nums[i]==secondNum)count2++;
        }
        if(count1 > n/3)
            majorityElement.add(firstNum);
        if(count2 > n/3 && secondNum != firstNum)
            majorityElement.add(secondNum);

        return majorityElement;
        
    }
}
