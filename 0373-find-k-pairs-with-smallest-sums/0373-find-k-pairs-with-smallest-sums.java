class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Set<Pair<Integer,Integer>> st = new HashSet<Pair<Integer,Integer>>();
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));
        st.add(new Pair(0,0));
    
        pq.add(new int[]{nums1[0]+nums2[0],0,0});

        
        while(k-- > 0 && !pq.isEmpty()){
            int[]current = pq.peek();
            pq.poll();
            int index1 = current[1];
            int index2 = current[2];
            ans.add(List.of(nums1[index1],nums2[index2]));

            if(index1+1<m && !st.contains(new Pair(index1+1,index2))){
                pq.add(new int[]{nums1[index1+1]+nums2[index2],index1+1,index2});
                st.add(new Pair(index1+1,index2));
            }
            if(index2+1<n && !st.contains(new Pair(index1,index2+1))){
                pq.add(new int[]{nums1[index1]+nums2[index2+1],index1,index2+1});
                st.add(new Pair(index1,index2+1));
            }
        }
        
        return ans;
    }
}
