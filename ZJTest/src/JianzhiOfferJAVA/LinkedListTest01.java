package JianzhiOfferJAVA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
class ListNode{
    int val;
    ListNode next;
//构造方法
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
}
public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList<ListNode> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //尾插法构造链表
        ListNode head = new ListNode();
        ListNode p = head;
        for (int i = 0; i < n; i++) {
            ListNode temp = new ListNode(sc.nextInt());
            p.next = temp;
            p = temp;
        }
        print(head);
        //从尾到头打印链表 - 集合
        //ArrayList<Integer> result = new ArrayList<>();
        // result = printListFromTailToHead(head);
        //System.out.println(result.toString());
        //从尾到头打印链表 - 栈
        //readListFromTailToHead(head);
        ListNode pHead = deleteDuplication(head);
        print(pHead);
    }
    //打印链表
    public static void print(ListNode head) {
        ListNode p = head.next;
        while(p!= null ){
            if(p.next != null)
                System.out.print(p.val + " - >");
            else
                System.out.print(p.val);
            p = p.next;
        }
        System.out.println();
    }
    //从尾到头打印链表 - 集合
    public static ArrayList<Integer> printListFromTailToHead(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();
        ListNode p = head.next;
        while(p != null){
            list.add(0,p.val);
            p = p.next;
        }
        return list;
    }
    //从尾到头打印链表 - 栈
    public static void readListFromTailToHead(ListNode head){
     Stack<Integer>list = new Stack<Integer>();
        ListNode p = head.next;
        while(p != null){
            list.push(p.val);
            p = p.next;
        }
        while(!list.isEmpty()){
            System.out.print(list.pop() + "\t");
        }
        System.out.println();
    }
    //删除重复节点，重复节点保留一个
        public static ListNode deleteDuplication(ListNode pHead)
        {
            if(pHead == null || pHead.next == null)
                return pHead;
            ListNode next = pHead.next;
            if(pHead.val == next.val){
                while(next!= null && pHead.val == next.val)
                    next = next.next;
            }
            pHead.next = deleteDuplication(next);
            return pHead;
        }
}
