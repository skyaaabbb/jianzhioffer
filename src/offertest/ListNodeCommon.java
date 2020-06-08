package offertest;

/**
 * 问题描述：
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，
 * 所以错误测试数据的提示是用其他方式显示的，
 * 保证传入数据是正确的）
 * 解题思路：两个链表从它们的第一个公共节点开始，后面都完全重合。
 * 所以先遍历链表1和2，得到两个链表的长度。它们的公共节点最早是其长度相同地方开始的。
 */
public class ListNodeCommon {

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    //实现方法
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            if(pHead1 == null || pHead2 == null){
                return null;
            }
            int count1 = 0;
            int count2 = 0;
            ListNode p1 = pHead1;
            ListNode p2 = pHead2;
            //遍历统计链表1和链表2的长度
            while(p1 != null){
                p1 = p1.next;
                count1++;
            }
            while(p2 != null){
                p2 = p2.next;
                count2++;
            }
            int flag = count1 - count2;
            while(flag > 0){
                pHead1 = pHead1.next;
                flag--;
            }
            //从长度相等的地方开始比较
            while(pHead1 != pHead2){
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
            return pHead1;
        }
    }
