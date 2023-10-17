class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        int[]inDegree = new int [n];
        for(int i= 0;i<n;i++){
            if(leftChild[i]!=-1){
                adj.get(i).add(leftChild[i]);
                inDegree[leftChild[i]]++;
            }
                
            if(rightChild[i]!=-1){
                adj.get(i).add(rightChild[i]);
                inDegree[rightChild[i]]++;
            }
                
        }

        int root = -1;
        int rootCnt = 0;
        for(int i =0;i<n;i++){
            if(inDegree[i]>1)
                return false;
            if(inDegree[i]== 0){
                rootCnt++;
                root = i;
            }
            if(rootCnt >1)
                return false;

        }
        if(rootCnt ==0)
            return false;


        Queue<Integer> q = new LinkedList<Integer>();
        int[]visited = new int [n];
        
        q.add(root);
        visited[root]=1;

        while(!q.isEmpty()){
            int current = q.peek();
            q.poll();

            for(int i: adj.get(current)){
                if(visited[i]==1)
                    return false;
                else{
                    visited[i]=1;
                    q.add(i);
                }
            }
        }

        int visSum=0;
        for(int i:visited){
            visSum+=i;
        }
        if(visSum<n)
            return false;

        return true;
    }
}