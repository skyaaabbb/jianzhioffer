package JianzhiOfferJAVA;

import java.util.LinkedList;
import java.util.Queue;

public class CTreel {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        CTreel t = new CTreel();
        System.out.println(t.tree1(a));
    }
    public long tree1 (int[] a) {
        // write code here
        long sum = 0;//累加和
        //不满足的情况
        if(a == null || a.length <= 0)
            return sum;
        int i = 0;//数组下标
        Queue<Integer> queue = new LinkedList<Integer>();//层次遍历
            queue.add(a[i]);//根节点进队
             while(!queue.isEmpty()){//当队列不为空时
              int t = queue.poll();
                 for (int k = 0; k < 2; k++) {//进队左右子节点并计算异或和
                     if(i < a.length - 1){
                         queue.add(a[i+1]);
                         i = i + 1;
                         sum += (t ^ a[i]);
                     }
                 }
               }
     return sum;
    }
}
