class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<Integer,Integer>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair>pq = new PriorityQueue<>(new comp());
        for(Map.Entry<Integer,Integer>e :mp.entrySet()){
            pq.add(new Pair(e.getKey(),e.getValue()));

            if(pq.size()>k){
                pq.poll();
            }
        }

        int[]kFreq = new int[k];
        int index = 0;
        while(!pq.isEmpty()){
            Pair temp = pq.peek();
            kFreq[index++]=temp.first;
            pq.poll();
        }

        

        return kFreq;
    }
    
}
class Pair{
    int first;
    int second;

    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class comp implements Comparator<Pair>{
    public int compare(Pair a , Pair b){
        return a.second - b.second;
    }
}