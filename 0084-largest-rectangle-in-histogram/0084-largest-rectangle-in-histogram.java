class Solution {
    public int[] nextMininumRight(int []heights){
        int []ans= new int[heights.length];
        int n =heights.length;
        Stack<Integer>st = new Stack<>();
        for(int i =n-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                    st.pop();
                }
                if(st.isEmpty())
                    ans[i]=-1;
                else
                    ans[i]=st.peek();
                st.add(i);
                  
            }

           
        }
         return ans;
    }
    public int[]nextMinLeft(int[]heights){
        int n = heights.length;
        int []ans = new int[n];
        Stack<Integer>st = new Stack<>();

        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                    st.pop();
                }
                if(st.isEmpty())
                    ans[i]=-1;
                else
                    ans[i]=st.peek();
                st.add(i);
                  
            }
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[]rightMin = nextMininumRight(heights);
        int[]leftMin = nextMinLeft(heights);
         int ans = 0;

         for(int i=0;i<n;i++){
             int currentArea = ((rightMin[i]-1)-(leftMin[i]+1)+1)*heights[i];
             if(rightMin[i]==-1 && leftMin[i]==-1){
                 currentArea = heights[i]*n;
             }
             else if(rightMin[i]==-1){
                 currentArea = (n - (leftMin[i]+1))*heights[i];
             }
             else if(leftMin[i]==-1){
                 currentArea = rightMin[i] *heights[i];
             }
             
             ans = Math.max(currentArea,ans);
         }
        return ans;
    }
}