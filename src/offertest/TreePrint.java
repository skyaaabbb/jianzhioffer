package offertest;
import java.util.ArrayList;
/**
 * 问题描述：从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 知识点：队列，树
 */
/*class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }*/
//方法实现
public class TreePrint {
        ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            depth(pRoot, 1, list);
            return list;
        }
        private void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list) {
            if(root == null) return;
            if(depth > list.size())
                list.add(new ArrayList<Integer>());
            list.get(depth -1).add(root.val);

            depth(root.left, depth + 1, list);
            depth(root.right, depth + 1, list);

        }
}
