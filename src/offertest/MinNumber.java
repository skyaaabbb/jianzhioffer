package offertest;

import java.util.Arrays;

/**
 * 问题描述：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class MinNumber {
    //测试方法
    public static void main(String[] args) {
        int[] numbers = {3,32,321};
        System.out.println(PrintMinNumber(numbers));
    }
//实现方法
    private static String PrintMinNumber(int[] numbers) {
        //将数组转换成字符串数组
        if(numbers == null || numbers.length <= 0)
            return "";
        int length = numbers.length;
        String[] nums = new String[length];
        for (int i = 0; i < length; i++) {
            nums[i] = numbers[i] +"";
        }
        //对字符串数组进行排序，排序时比较对象s1,s2
        //若s1 + s2 < s2 + s1 则s1在前，否则s2在前
        //排序规则：(s1,s2) -> (s1 + s2).compareTo(s2 + s1)
        Arrays.sort(nums,(s1,s2) -> (s1 + s2).compareTo(s2 + s1));
        //将排序后的字符串数组连接起来，组成最小的数字
        StringBuilder s = new StringBuilder();
        for (String st:nums) {
            s.append(st);
        }
        return s.toString();
    }
}
