package offertest;

/**
 * 问题描述：给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class CircleNodeStart {
    //实现方法
        //找快慢指针的相遇节点
        ListNode MeetingNode(ListNode pHead){
            if(pHead == null){
                return null;
            }
            ListNode pSlow = pHead.next;
            if(pSlow == null){
                return null;
            }
            ListNode pFast = pSlow.next;
            while(pSlow != null && pFast != null){
                if(pSlow == pFast) return pFast;
                pSlow = pSlow.next;
                pFast = pFast.next;
                if(pFast != null){
                    pFast = pFast.next;
                }
            }
            return null;
        }
        //实现找到链表的环入口
        public ListNode EntryNodeOfLoop(ListNode pHead)
        {
            ListNode meetingNode = MeetingNode(pHead);
            if(meetingNode == null){
                return null;
            }
            //得到环中节点的数目
            int nodeInloop = 1;
            ListNode pNode1 = meetingNode;
            while(pNode1.next != meetingNode){
                pNode1 = pNode1.next;
                nodeInloop++;
            }
            //pNode1先走环中节点个数的次数
            pNode1 = pHead;
            for(int i = 0; i < nodeInloop; i++){
                pNode1 = pNode1.next;
            }
            ListNode pNode2 = pHead;
            while(pNode1 != pNode2){
                pNode1 = pNode1.next;
                pNode2 = pNode2.next;
            }
            return pNode1;
        }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}


