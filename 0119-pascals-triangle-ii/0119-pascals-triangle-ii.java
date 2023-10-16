class Solution {
    public List<Integer> getRow(int rowIndex) {
      int[][]triangle  = new int[rowIndex+1][rowIndex+1];
      for(int[]row :triangle)
        Arrays.fill(row,0);
    
     for(int i=0;i<=rowIndex;i++){
         for(int j=0;j<=rowIndex;j++){
            if(j > i){
                 triangle[i][j]=0;
             }
             else if(j==0 || j == i){
                 triangle[i][j]=1;
             }
             else{
                 System.out.println(i +" "+j);
                 triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
             }
         }
     }
    List<Integer> ans = new ArrayList<Integer>();
     for(int j = 0;j<=rowIndex;j++){
         ans.add(triangle[rowIndex][j]);
     }
     return ans;

    }
}