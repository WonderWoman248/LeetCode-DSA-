class KthLargest {
    private static int k;
    PriorityQueue<Integer> pq ; 
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(new comp());
        this.k = k;
        for(int i: nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.poll();
        }

        return pq.peek();
        
    }
}
class comp implements Comparator<Integer>{
    public int compare(Integer a , Integer b){
        return a-b;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */