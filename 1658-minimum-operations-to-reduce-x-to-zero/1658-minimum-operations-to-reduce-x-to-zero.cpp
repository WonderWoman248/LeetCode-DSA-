class Solution {
public:
    int maxSubArrayLen(vector<int>&nums, int sum){
        unordered_map<int,int>mp;
        
        int runningSum=0;
        int maxLen=0;
        for(int i=0;i<nums.size();i++){
           runningSum+=nums[i];

            if(runningSum==sum){
                maxLen=max(i+1,maxLen);
            }
            
            else if(mp.find(runningSum-sum)!=mp.end()){
                maxLen=max(i+1-mp[runningSum-sum],maxLen);
            }
            mp[runningSum]=i+1;
        }
        return maxLen;
    }
    int arraySum(vector<int>&nums){
        int sum=0;
        for(auto it:nums){
            sum+=it;
        }
        return sum;
    }
    int minOperations(vector<int>& nums, int x) {
        int sum=arraySum(nums);
        int result=maxSubArrayLen(nums,sum-x);
        
        if(result==0){
            if(sum!=x)
                return -1;
        }
        return nums.size()-result;
        
        
    }
};