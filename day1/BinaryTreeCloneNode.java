/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return printPostorder(cloned,target.val);
    }
    TreeNode printPostorder(TreeNode node, int val) 
    { 
        if (node == null) 
            return null; 
        
        else if (node.val==val)
            return node;
  
        // first recur on left subtree 
        TreeNode t=printPostorder(node.left,val); 
        
        if(t!=null)
            return t;
  
        // then recur on right subtree 
        TreeNode a=printPostorder(node.right,val); 
        return a;
  
        // now deal with the node 
        // System.out.print(node.key + " "); 
    } 
}