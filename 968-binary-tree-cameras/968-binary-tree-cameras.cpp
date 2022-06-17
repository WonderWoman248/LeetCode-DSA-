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
    set<TreeNode*> isCovered;
    int minCameraCover(TreeNode* root) {
        if(root==NULL)return 0;
        count=0;
        isCovered.insert(NULL);
        dfs(root,NULL);
        return count;
    }
    
    void dfs(TreeNode* node, TreeNode* parent){
        if(node != NULL){
            dfs(node->left,node);
            dfs(node->right,node);
            
            if(parent==NULL and isCovered.find(node)==isCovered.end() ||
              isCovered.find(node->left)==isCovered.end() 
               or isCovered.find(node->right)==isCovered.end()){
                count++;
                isCovered.insert(parent);
                isCovered.insert(node);
                isCovered.insert(node->left);
                isCovered.insert(node->right);
            }
                
        }
    }
};