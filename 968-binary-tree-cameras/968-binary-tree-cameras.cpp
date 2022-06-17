/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int count;
   
    int minCameraCover(TreeNode* root) {
        count=0;
        int ans= dfs(root);
        return ans==0?count+1:count;
    }
//     0-> is Not covered
//     1-> is covered
//     2-> has camera
    int dfs(TreeNode* node){
        if(node==NULL) return 1;
        int left=dfs(node->left);
        int right=dfs(node->right);
        
        if(left==0 or right == 0){
            count++;
            return 2;
        }
        else if(left==2 or right==2){
            return 1;
        }
        return 0;
    }
};