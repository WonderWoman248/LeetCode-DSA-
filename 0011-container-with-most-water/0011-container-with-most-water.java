class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxPsbl = 0;
        int i=0,j=n-1;

        while(i<j){
            int currentArea = Math.min(height[i],height[j])*(j-i);
            maxPsbl = Math.max(currentArea,maxPsbl);
            if(height[i]>height[j]){
                j--;
            }
            else if(height[i]<height[j]){
                i++;
            }
            else{
                i++;
                j--;
            }
        }

        return maxPsbl;
        
    }
}