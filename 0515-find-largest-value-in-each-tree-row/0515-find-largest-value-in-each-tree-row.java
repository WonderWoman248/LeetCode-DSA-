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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)
            return new ArrayList<Integer>();
        
        List<Integer>ans = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           int size = q.size();
           int currMax = Integer.MIN_VALUE;
           while(size-->0){
              TreeNode current = q.peek();
              q.poll();
              currMax = Math.max(current.val,currMax);
              if(current.left!= null){
                  q.add(current.left);
                //   currMax = max(current.left.val, currMax);
              }
              if(current.right != null){
                  q.add(current.right);
              }
           }
           ans.add(currMax);
        }
        return ans;

    }
}