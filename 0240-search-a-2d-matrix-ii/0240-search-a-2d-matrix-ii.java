class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        int i=0, j = c-1;

        while(i<r && j>=0){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }

        return false;
        
    }
}