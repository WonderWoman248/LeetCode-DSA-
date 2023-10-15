// Number of connected components
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=v;i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<v;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(j==i)
                    continue;
                else if(isConnected[i][j]==1)
                    adj.get(i+1).add(j+1);
            }
        }

       int []visited = new int[v+1];
       Arrays.fill(visited,0);
    
      int count = 0;
       for(int i=1;i<=v;i++){
           if(bfs(adj,visited,i))
            count++;

       }

        return count;
        
    }

    private Boolean bfs(ArrayList<ArrayList<Integer>>adj, int[]visited,int i){
       
        Queue<Integer>bfsQueue = new LinkedList<Integer>();
        if(visited[i]==1)
            return false;
        
        bfsQueue.add(i);
        visited[i]=1;

        while(!bfsQueue.isEmpty()){
            int currentNode = bfsQueue.peek();
            bfsQueue.poll();
            for(int j : adj.get(currentNode)){
                if(visited[j]!=1){
                    bfsQueue.add(j);
                    visited[j]=1;
                }
            }
        }
      

        return true;

    }
}