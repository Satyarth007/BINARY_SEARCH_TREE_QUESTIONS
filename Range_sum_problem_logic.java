// This is the question in leetcode, RANGE SUM OF BST!  
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
 // This logic will help to solve this question---------------------------------------------
class Solution {
     int sum=0;                                                  // sum = 0 to store the sum in step by step traversal
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){                                          // if tree is empty , simply return 0
            return 0;
        }
        if(root.val>=low && root.val<=high){                    // now compare the values and sum if condition is true 
            sum+=root.val;
        }
        rangeSumBST(root.left,low,high);                        // solve for left sub-trees to get into each node recursively
        rangeSumBST(root.right,low,high);                       // solve for right sub-trees to get into each node recursively
        
    return sum;                                                 // finally return the final sum
    }
    
}
