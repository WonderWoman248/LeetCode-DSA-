class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[]result = new int[n-k+1];

        Deque<Integer>dq = new ArrayDeque<>();
        int i = 0,index = 0;

        while(i<n){
           if(dq.isEmpty())
                dq.addLast(i);
            else{
                while(!dq.isEmpty() && nums[dq.getLast()] < nums[i]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            

            if(dq.getFirst()<= i-k)
                dq.removeFirst();
            if(i >= k-1)
                result[index++]= nums[dq.getFirst()];
            i++;
        }

        return result;
    }
}
/* 
  1. insert 
        if min remove
   2. k index, n-k ya less wale hata do
   3. dq front wale answer mein add kr do
*/
