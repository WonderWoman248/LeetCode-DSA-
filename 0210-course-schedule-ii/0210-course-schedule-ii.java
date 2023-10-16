class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        } 
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int []visited = new int[numCourses];
        Arrays.fill(visited,0);

        int[]schedule = new int[numCourses];
        Stack<Integer>st = new Stack<>();
        boolean cycle = false;
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0)
                cycle = dfs(i,adj,visited,st);
            if(cycle)
                return new int[0];
        }
        int index = 0;
        while(!st.empty()){
            schedule[index++] = st.peek();
            st.pop();
        }
        return schedule;
    }
    
    private boolean dfs(int node, ArrayList<ArrayList<Integer>>adj,int[]visited,Stack st){
        visited[node]=1;
       for(int i: adj.get(node)){
           if(visited[i]==1)
                return true;
            else if(visited[i]==0){
                if(dfs(i,adj,visited,st))
                    return true;
                
            }
       }
       visited[node]=-1;
       st.add(node);
       return false;
    }
}