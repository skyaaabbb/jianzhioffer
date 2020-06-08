package offertest;
/**
 * 问题描述：定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数
 * （时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 * 解题思路：每次进栈操作时，最小元素栈中当前最小元素进栈一次。
 */

import java.util.Stack;
public class StackMin {
   Stack<Integer> m_data = new Stack<Integer>();
   Stack<Integer> m_min = new Stack<Integer>();
   //进栈
   public void push(int node) {
       m_data.push(node);
       if(m_min.size() <= 0 ||node < m_min.peek()){
           m_min.push(node);
       }else{
           m_min.push(m_min.peek());
       }
   }
//出栈
   public void pop() {
       if(m_data.size() > 0 && m_min.size() > 0){
           m_data.pop();
           m_min.pop();
       }
   }
//获取栈顶元素
   public int top() {
       return m_data.peek();
   }
//获取栈中最小元素
   public int min() {
       return m_min.peek();
   }
}
