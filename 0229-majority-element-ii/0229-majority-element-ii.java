class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int reqMinCount = n/3;
        List<Integer> ans = new ArrayList<>();
        int firstMajorEle=0, secondMajorEle = 0;
        int firstMajorEleCount =0,secondMajorEleCount=0;

        for(int i=0;i<n;i++){
            if(firstMajorEleCount == 0 && nums[i]!= secondMajorEle){
                firstMajorEleCount++;
                firstMajorEle = nums[i];
            }
            else if(secondMajorEleCount == 0 && nums[i]!= firstMajorEle){
                secondMajorEleCount++;
                secondMajorEle = nums[i];
            }
            else if(firstMajorEle == nums[i] ){
                firstMajorEleCount++;
            }
            else if(secondMajorEle == nums[i] ){
                secondMajorEleCount++;
            }
            else{
                secondMajorEleCount--;
                firstMajorEleCount--;
            }

        }
        int count1=0,count2=0;
        
        for(int i = 0;i<n;i++){
            if(nums[i]==firstMajorEle)
                count1++;
            else if(nums[i]== secondMajorEle)
                count2++;
        }

        if(count1 > reqMinCount)
            ans.add(firstMajorEle);
        if(count2>reqMinCount)
            ans.add(secondMajorEle);

        return ans;
    }
}


