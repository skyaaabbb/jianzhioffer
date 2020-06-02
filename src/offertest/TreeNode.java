package offertest;

public class Solution {
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
