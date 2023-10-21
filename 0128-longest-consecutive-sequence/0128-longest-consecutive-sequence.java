class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        for(int i:nums){
            pq.add(i);
        }
        int count = 1;
        int ans = 1;
        int current = pq.peek();
        pq.poll();
        while(!pq.isEmpty()){
            if(pq.peek() - current == 1){
                count++;
                current = pq.peek();
                pq.poll();
            }
            else if(pq.peek() - current == 0){
                pq.poll();
            }
            else{
                count = 1;
                current = pq.peek();
            }
            ans = Math.max(ans, count);
        }
        
        return ans;
        
    }
}