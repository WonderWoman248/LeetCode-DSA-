class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {  
        unordered_set<int>us;
        int currSum=0, maxSum=0,l=0;
        
        for(int num:nums){
            while(us.find(num)!=us.end()){
                currSum-=nums[l];
                   us.erase(nums[l]);
                l+=1;
            }
            currSum+=num;
            us.insert(num);
            maxSum=max(maxSum,currSum);
        }
        
        return maxSum;
    
    }
};