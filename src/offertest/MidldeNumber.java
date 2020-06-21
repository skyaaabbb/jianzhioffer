package offertest;
/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
public class MidldeNumber {
    //大顶堆存储左半边元素
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    //小顶堆存储右半边元素
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    //统计元素个数
    int N = 0;
    public void Insert(Integer num) {
        //方法一
        /*
        array.add(num);
        Collections.sort(array);//集合排序用Collections工具类，基本类型排序用Arrays
        */
        //方法二
        if(N % 2 == 0){
            //数组中奇数个元素时，存右边小顶堆
            left.add(num);
            right.add(left.poll());
        }else{
            //偶数个元素时存储在左边大顶堆
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMedian() {
        //方法一
        /*
        int length = array.size();
        if (length % 2 == 1) {
            Integer result = array.get((length - 1) / 2);
            return Double.valueOf(result);
        }
        Integer sum = array.get((length - 1) / 2) + array.get((length - 1) / 2 + 1);
        return Double.valueOf(sum / 2.00);
        */
        //方法二
        if(N % 2 == 0)
            return (left.peek() + right.peek())/2.0;
        else
            return (double) right.peek();
    }
}
