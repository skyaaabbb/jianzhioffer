package offertest;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 题目描述：给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class MaxNumInWindows {
    //方法一
   /* ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        if(num.length >= size && size > 0){
            int start = 0,end = size - 1;
            GetMaxNum(num,start,end);
        }
        return list;
    }
    public void GetMaxNum(int[] num,int start,int end){
        int max = 0,maxIndex = 0;
        while(end < num.length){
            if(start == 0 || maxIndex < start){
                max = num[start];
                maxIndex= start;
                for(int i = start + 1; i <= end; i++){
                    //原来窗口中最大元素移出窗口
                    if(max < num[i]){
                        max = num[i];
                        maxIndex = i;
                    }
                }
            }else{
                //原窗口中最大元素未移出窗口
                if(max < num[end]){
                    max = num[end];
                    maxIndex = end;
                }
            }
            list.add(max);
            start ++;
            end ++;
        }
    }*/
   //方法二 大顶堆
    ArrayList<Integer> ret = new ArrayList<>();
    PriorityQueue<Integer> heap = new PriorityQueue<>((o1,o2) -> o2- o1);
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        if(num.length < size || size < 1)
            return ret;
        for (int i = 0; i <size ; i++) {
            heap.add(num[i]);
        }
        ret.add(heap.peek());
        for(int i = 1,j = i + size - 1;j < num.length; i++,j++){
            heap.remove(num[i - 1]);
            heap.add(num[j]);
            ret.add(heap.peek());
        }
        return ret;
    }

}
