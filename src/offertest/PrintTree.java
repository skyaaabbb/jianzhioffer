package offertest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
/**
 * 问题描述：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 知识点：队列 树
 */
public class PrintTree {
    //实现方法
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();//集合，存放二叉树节点
        Queue<TreeNode> queue = new LinkedList();//遍历时，存放每层节点
        queue.add(root);//根节点进队
        while(!queue.isEmpty()){
            int cnt = queue.size();
            while(cnt-- > 0){
                TreeNode t = queue.poll();//出队
                if(t == null)
                    continue;
                ret.add(t.val);
                queue.add(t.left);//左孩子节点进队
                queue.add(t.right);//右孩子节点进队
            }
        }
        return ret;
    }
}
