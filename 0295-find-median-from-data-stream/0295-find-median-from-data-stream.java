class MedianFinder {
    Queue<Integer>minHeap;
    Queue<Integer>maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b)->b-a);
    }
    
    public void addNum(int num) {
      
        if(maxHeap.isEmpty() || maxHeap.peek()>num)
            maxHeap.add(num);
        else
            minHeap.add(num);
        
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size()>maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(minHeap.size()== maxHeap.size()){
            return (double)(minHeap.peek()+maxHeap.peek())/2.0;
        }
        
        return (double)maxHeap.peek();
       
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */