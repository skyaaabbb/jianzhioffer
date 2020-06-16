package offertest;

/**
 * 问题描述：给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * 解题思路：如果给定的节点有右子树，则其下一个节点为右子树的最左节点；
 * 否则，向上查找直到第一个左链接包含该节点的祖先节点
 */

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class TreeNextNode {
    //实现方法
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        //节点为空
        if(pNode == null){
            return null;
        }
        //节点存在右子树
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            //寻找右子树的最左节点
            while(node.left != null){
                node = node.left;
            }
            return node;
        }else{
            //向上寻找第一个左链接包含该节点的祖先节点
            while(pNode.next != null){
                TreeLinkNode parent = pNode.next;
                if(parent.left == pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
