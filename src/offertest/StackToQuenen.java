package offertest;
/**
 * 问题描述：
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */

import java.util.Stack;

public class StackToQuenen {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    //进队操作
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        //将栈1中的元素全部出栈并进入到栈2中
        while(! stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        //出队元素
        int first = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return first;
    }
}
