class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer>st = new Stack<>();
        int []tempAns= new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else if(asteroids[i]< 0 && st.empty()){
                tempAns[index]= asteroids[i];
                index++;
            }
            else{
               
                int currentSize=-1*asteroids[i];

                if(!st.empty() && currentSize < st.peek())
                    continue;
                else if(!st.empty() && currentSize == st.peek())
                    st.pop();
                else{
                    while(!st.empty()&& currentSize>st.peek()){
                        st.pop();
                    }
                    if(st.empty()){
                          tempAns[index]=asteroids[i];
                            index++;
                    }
                    else if(!st.empty() && st.peek()== currentSize){
                        st.pop();
                    }
                  
                    
                }
            }
        }
        int k=n-1;
        while(!st.empty()){
            int current = st.peek();
            tempAns[k]=current;
            k--;
            st.pop();
        }
        
       int finalAnsSize=0;
       for(int i: tempAns){
           if(i!=0)
                finalAnsSize++;
       }
       int []ans = new int[finalAnsSize];
       int j=0;
       
       for(int i=0;i<n;i++){
           if(tempAns[i]!=0){
               ans[j]=tempAns[i];
               j++;
           }
       }
        return ans;
        
    }
}
