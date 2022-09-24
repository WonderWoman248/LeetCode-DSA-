class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>pascalTriangle(numRows);
     
        for(int i=0;i<numRows;i++){
            vector<int>temp(i+1);
            pascalTriangle[i]=temp;
            for(int j=0;j<i+1;j++){
                if(j==0 or j==i )
                    pascalTriangle[i][j]=1;
                else
                   pascalTriangle[i][j]=pascalTriangle[i-1][j-1]+ pascalTriangle[i-1][j];
            }
        }
        return pascalTriangle;
    }
};