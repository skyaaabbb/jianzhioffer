package offertest;
import java.util.ArrayList;

/**
 * 问题描述：输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，
 * 输出两个数的乘积最小的。
 * 知识点：数学 数组 双指针
 * 要求：
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出。
 * 解题思路：由于数组是递增排序的，和固定，相差最大的两个数乘积最小。
 * 依据：(a + b)*(a + b) >= 2a*b (a==b 时，等号成立)
 */
public class SumAndMin {
    //测试方法
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        int sum = 7;
        System.out.println(FindNumbersWithSum(array,sum));
    }
    //实现方法
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //从数组的两端开始遍历，查找和为sum的两个数
        for(int i = 0,j = array.length - 1; i < j;){
            if(array[i] + array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }else if(array[i] + array[j] < sum){
                i++;
            }else{
                j--;
            }
        }
        return list;
    }
}
