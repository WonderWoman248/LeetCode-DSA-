class NumMatrix {
public:
    vector<vector<int>>sumMatrix;
    NumMatrix(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int m=matrix[0].size();
        
        for(int i=0;i<n;i++){
            vector<int>temp;
            for(int j=0;j<m;j++){
                if(j==0){
                    temp.push_back(matrix[i][j]);
                }
                else{
                    temp.push_back(temp[j-1]+matrix[i][j]);
                }
            }
            sumMatrix.push_back(temp);
        }
        
    }
    
    int sumRegion(int row1, int col1, int row2, int col2) {
        int withExtraSum=0;
        int sumToRemove=0;
        
        for(int i=row1;i<=row2;i++){
            withExtraSum+=sumMatrix[i][col2];
        }
        if(col1!=0){
            for(int i=row1;i<=row2;i++){
                sumToRemove+=sumMatrix[i][col1-1];
            }
        }
        return withExtraSum-sumToRemove;
    }
};

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix* obj = new NumMatrix(matrix);
 * int param_1 = obj->sumRegion(row1,col1,row2,col2);
 */