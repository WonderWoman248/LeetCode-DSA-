class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
        int[]indegree = new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<relations.length;i++){
            adj.get(relations[i][0]-1).add(relations[i][1]-1);
            indegree[relations[i][1]-1]++;
        }

        Queue<Integer> topoSort = new LinkedList<Integer>();
        int[]maxTime = new int[n];
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                topoSort.add(i);
                maxTime[i]=time[i];
            }
                
        }

        while(!topoSort.isEmpty()){
            int current = topoSort.peek();
            topoSort.poll();
            for(int i: adj.get(current)){
                indegree[i]--;
                 maxTime[i]=Math.max(maxTime[i],time[i]+maxTime[current]);
                if(indegree[i]==0){
                    topoSort.add(i);
                }
                    
            }
        }
        int ans=0;

        for(int it:maxTime){
            ans = Math.max(it,ans);
        }

        return ans;
    }

   
}