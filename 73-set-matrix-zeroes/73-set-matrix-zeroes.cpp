class Solution {
public:
    void setMatrixZero(set<int>rowZero, set<int>columnZero, vector<vector<int>>& matrix){
        for(auto it:rowZero){
            for(int i=0;i<matrix[0].size();i++){
                matrix[it][i]=0;
            }
        }
        for(auto it:columnZero){
            for(int i=0;i<matrix.size();i++){
                matrix[i][it]=0;
            }
        }
    }
    void setZeroes(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int m=matrix[0].size();
        
        set<int>rowZero;
        set<int>columnZero;
        
        

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rowZero.insert(i);
                    columnZero.insert(j);
                }
            }
        }
        
        setMatrixZero(rowZero,columnZero,matrix);
        
    }
};