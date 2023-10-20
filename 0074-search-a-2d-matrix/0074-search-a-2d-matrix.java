class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int rowLow = 0, rowHigh = n-1;

        while(rowLow<=rowHigh){
            int midRow = (rowLow + rowHigh)/2;
            int cLow = 0, cHigh = m-1;
            while(cLow<=cHigh){
                int mid = (cLow + cHigh)/2;
                if(matrix[midRow][mid]==target)
                    return true;
                else if(matrix[midRow][mid]>target){
                    cHigh = mid-1;
                }
                else{
                    cLow = mid+1;
                }
            }
            if(cLow == 0){
                rowHigh = midRow-1;
            }
            else{
                rowLow = midRow+1;
            }
        }

        return false;
        
    }
}