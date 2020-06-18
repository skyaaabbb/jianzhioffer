package offertest;

/**
 * 问题描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 知识点：数组
 */
public class ReOrder {
    //实现方法
    public void reOrderArray(int [] array) {
        // 统计奇数个数
        int oddCnt = 0;
        for (int val : array)
            if (val % 2 == 1)
                oddCnt++;
        int[] copy = array.clone();//复制数组
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                array[i++] = num;//重新存放奇数
            else
                array[j++] = num;//重新存放偶数
        }
    }
}
