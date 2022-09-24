class Solution {
public:

    void setMatrixZero(vector<vector<int>>&matrix,bool flag1, bool flag2){
    
        for(int i=1;i<matrix.size();i++){
            for(int j=1;j<matrix[0].size();j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        if(flag1 & flag2){
            for(int i=0;i<matrix[0].size();i++){
                matrix[0][i]=0;
            }
            for(int i=0;i<matrix.size();i++){
                matrix[i][0]=0;
            }
        }
        else if(flag1){
            for(int i=0;i<matrix.size();i++){
                matrix[i][0]=0;
            }
        }
        else if(flag2){
            for(int i=0;i<matrix[0].size();i++){
                matrix[0][i]=0;
            }
        }
    }
    void setZeroes(vector<vector<int>>& matrix) {   
        int n=matrix.size();
        int m=matrix[0].size();
        
        bool flag1=false;
        bool flag2=false;
        
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0)
                flag1=true;
        }
        for(int i=0;i<m;i++){
            if(matrix[0][i]==0)
                flag2=true;
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        setMatrixZero(matrix,flag1,flag2);
    }
        
    };