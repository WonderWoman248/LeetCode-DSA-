class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = n;
        HashSet<Integer>unique = new HashSet<>();
        for(int i:nums){
            unique.add(i);
        }
        int[]uniqueNums = new int[unique.size()];
        int index= 0;
        for(int i:unique){
            uniqueNums[index++]=i;
        }
        Arrays.sort(uniqueNums);

        for(int i=0;i<uniqueNums.length;i++){
            int left = uniqueNums[i];
            int maxReq = left + n -1;
            int j = validElements(uniqueNums,i,maxReq);
            
            int valid = j-i;
            int req = n-valid;
            ans = Math.min(ans, req);
        }
        return ans;
    }
    private int validElements(int[]nums, int startIndex,int maxReq){
      int start = startIndex;
      int end = nums.length-1;

      while(start<=end){
          int mid = (start+end)/2;
          if(nums[mid]>maxReq){
              end = mid-1;
          }
          else{
              start = mid+1;
          }
      }
      System.out.println(start);
      return start;

    }
}

