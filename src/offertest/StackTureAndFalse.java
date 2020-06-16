package offertest;

import java.util.Scanner;
import java.util.Stack;

/**
 * 问题描述：输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */

public class StackTureAndFalse {
    //测试方法
    public static void main(String[] args){
        //输入两个序列
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] pushA = new int[length];
        int[] popA = new int[length];
        for (int i = 0; i < length ; i++) {
            pushA[i] = sc.nextInt();
        }
        for (int i = 0; i < length ; i++) {
            popA[i] = sc.nextInt();
        }
        System.out.println(IsPopOrder(pushA,popA));
    }
    //实现方法
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int n = pushA.length;//序列长度
        Stack<Integer> stack = new Stack<>();
        for(int pushIndex = 0,popIndex = 0; pushIndex < n; pushIndex++){
            stack.push(pushA[pushIndex]);//进栈
            while(popIndex < n && !stack.isEmpty()
                    && stack.peek() == popA[popIndex]){
                stack.pop();//出栈
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
