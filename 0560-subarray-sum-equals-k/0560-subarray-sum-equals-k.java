class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        int[]prefixSum = new int[n];

        prefixSum[0]=nums[0];

        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        int count = 0;
        for(int i:prefixSum){
            System.out.print(i+" ");
        }
        Map<Integer,Integer>mp= new HashMap<Integer,Integer>();
        for(int sum:prefixSum){
            if(mp.containsKey(sum - k)){
                count += mp.get(sum - k);
            }
            if(sum == k){
                count++;
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }

        return count;
    }
}