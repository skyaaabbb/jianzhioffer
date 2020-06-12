package offertest;

import java.util.Scanner;

/**
 * 问题描述：输入一个链表，反转链表后，输出新链表的表头。
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class ReverLink {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode f1 = new ListNode(2);
        ListNode f2 = new ListNode(3);
        ListNode f3 = new ListNode(4);
        head.next = f1;
        f1.next = f2;
        f2.next = f3;
        printListNode(head);
        head = ReverseList(head);
        printListNode(head);
    }

    //实现反转链表的方法
    public static ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode Head = head;
        ListNode preHead = null;
        while(Head!= null){
            ListNode prePre = Head.next;
            if(prePre == null){
                preHead = Head;
            }
            Head.next = pre;
            pre = Head;
            Head = prePre;

        }
        return preHead;
    }
    //打印链表
    public static void printListNode(ListNode head){
    while(head != null){
        System.out.print(head.val+ "\t");
        head = head.next;
    }
        System.out.println();
    }
}

