class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int n = weights.length;
      int low = maxElement(weights);
      int high = sumElement(weights);

      int capacity = Integer.MAX_VALUE;
      while(low<= high){
          int mid = (low+high)/2;

          if(canShipInLimit(weights,days,mid)){
              capacity = Math.min(mid,capacity);
              high = mid-1;
          }
          else{
              low = mid+1;
          }
      }

      return capacity;
        
    }
    private int maxElement(int[]weight){
        int maxElement = Integer.MIN_VALUE;
        for(int i :weight){
            maxElement = Math.max(maxElement, i);
        }
        return maxElement;
    }
    private int sumElement(int []weight){
        int sum = 0;
        for(int i:weight){
            sum+=i;
        }
        return sum;
    }
    private boolean canShipInLimit(int []weight, int days, int capacity){
        int totalDays = 1;
        int currentWeight = 0;

        for(int i=0;i<weight.length;i++){
            currentWeight += weight[i];
            if(currentWeight > capacity){
                totalDays++;
                currentWeight = weight[i];
            }
        }
        return totalDays <= days;
    }
}