package offertest;

/**
 * 问题描述：
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
class Solution {
    public void Mirror(TreeNode root) {
        //空树
        if(root == null){
            return;
        }
        //只有一个节点的树
        if(root.left == null && root.right == null){
            return;
        }
        //非无子树的二叉树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null){
            Mirror(root.left);
        }
        if(root.right != null){
            Mirror(root.right);
        }

    }
}
