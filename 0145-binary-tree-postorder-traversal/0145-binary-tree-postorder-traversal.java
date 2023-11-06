/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>ans ;
    void helper(TreeNode root){
        if(root == null)
            return;
        helper(root.left);
        helper(root.right);
        ans.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<Integer>();
        helper(root);
        return ans;
    }
}