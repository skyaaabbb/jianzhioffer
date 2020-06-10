package offertest;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * 平衡二叉树特点：左右子树深度相差 <= 1.
 */
public class BitTree {
    //方法一：需要多次重复遍历节点
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }
        //判断每个节点左右子树的深度差
        int left = Depth(root.left);
        int right = Depth(root.right);
        int diff = left - right;
        if(diff > 1 || diff < -1){
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    //求深度
    int Depth(TreeNode root){
        if(root == null) return 0;
        int nLeft = Depth(root.left);
        int nRight = Depth(root.right);
        return nLeft > nRight ? nLeft + 1:nRight + 1;
    }
    //方法二：自底向上遍历，每个节点只需要遍历一次，后序遍历
    private boolean isBalanced=true;
    public boolean IsBalanced_Solution2(TreeNode root) {

        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeNode root){
        if(root==null)
            return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);

        if(Math.abs(left-right)>1){
            isBalanced=false;
        }
        return right>left ?right+1:left+1;

    }
}
