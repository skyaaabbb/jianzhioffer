package offertest;
import java.util.ArrayList;
/**
 * 问题描述：输入一颗二叉树的根节点和一个整数，
 * 按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class FindPath {
    //实现方法
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            backtracking(root, target, new ArrayList<>());
            return ret;
        }
        public void backtracking(TreeNode node, int target, ArrayList<Integer>  path){
            if(node == null)
                return;
            path.add(node.val);
            target -= node.val;
            //满足条件，则保存路径
            if(target == 0 && node.left == null && node.right == null){
                ret.add(new ArrayList<>(path));
            }else{
                //递归遍历左右子树节点
                backtracking(node.left,target,path);
                backtracking(node.right,target,path);
            }
            //到达叶节点不满足，则删除叶节点
            path.remove(path.size() - 1);
        }
    }
