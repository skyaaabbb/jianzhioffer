package offertest;
/**
 * 问题描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 知识点：查找 二分查找 顺序查找
 */

import java.util.ArrayList;
public class NumberMid{
    public int minNumberInRotateArray(int [] array) {
        if(array.length <= 0 || array == null){
            return -1;
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = index1;
        while(array[index1] >= array[index2]){
            if(index2 - index1 == 1){
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2)/2;
            //如果index1、index2、indexMid三者指向的数相等，只能顺序查找
            if(array[indexMid] == array[index1] && array[indexMid] == array[index2]){
                return MinInOrder(array,index1,index2);
            }
            //二分查找
            if(array[indexMid] >= array[index1]){
                index1 = indexMid;
            }else if(array[indexMid] <= array[index2]){
                index2 = indexMid;
            }
        }
        return array[indexMid];
    }
    //实现顺序查找
    public int MinInOrder(int[]array, int index1,int index2){
        int result = array[index1];
        for(int i = index1 + 1;i <= index2;i++){
            if(result > array[i]){
                result = array[i];
            }
        }
        return result;
    }
}
