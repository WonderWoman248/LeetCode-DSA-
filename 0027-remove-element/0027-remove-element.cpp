class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        
        int n=nums.size();
        
        
        int i=0;
        int j=n-1;
        
        while(i<=j){
            cout<<i<<" "<<j<<"\n";
            if(nums[i]==val and nums[j]!=val){
                
                swap(nums[i],nums[j]);
                j--;
                i++;
            }
            
            else if(nums[i]==val and nums[j]==val){
                j--;
            }
            
        else{
           i++; 
        }
        
    }

     return i;   
    }
};