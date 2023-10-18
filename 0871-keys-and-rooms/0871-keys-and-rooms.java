class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int[]visited = new int[n];

        Queue<Integer>q = new LinkedList<Integer>();
        q.add(0);
        visited[0]=1;

        while(!q.isEmpty()){
            int current = q.peek();
            q.poll();

            for(int i: rooms.get(current)){
                if(visited[i]==0){
                    visited[i]=1;
                    q.add(i);
                }
            }
        }

        for(int i: visited){
            if(i==0)
                return false;
        }

        return true;
        
    }
}