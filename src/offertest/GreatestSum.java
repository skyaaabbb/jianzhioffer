package offertest;
/**
 * 问题描述：
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会
 * 弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8
 * (从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 */

import java.util.Scanner;

public class GreatestSum {
    //测试方法
    public static void main(String[] args){
        System.out.println("请输入一个数组：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i = 0;i < length;i++){
            array[i] = sc.nextInt();
        }
        int result = FindGreatestSumOfSubArray(array);
        int result1 = FindGreatestSumOfArray(array);
        System.out.println("结果为："+result+"\t"+result1);
    }
    //实现方法一
        public static int FindGreatestSumOfSubArray(int[] array) {
            //数组长度小于等于0
            if(array.length <= 0){
                return -1;
            }
            //数组长度大于等于1时
            int curSum = 0;
            int GreatestSum = -2999999;
            for(int i = 0;i < array.length;i++){
                if(curSum <= 0){
                    curSum = array[i];
                }else{
                    curSum += array[i];
                }
                if(curSum > GreatestSum){
                    GreatestSum = curSum;
                }
            }
            return GreatestSum;
        }
        //实现方法二（动态规划）
        public static int FindGreatestSumOfArray(int[] array) {
            //数组长度小于等于0
            if(array.length <= 0){
                return -1;
            }
            //数组长度大于等于1时
            int max = array[0];//记录当前所有子数组的和的最大值
            int[] dp = new int[array.length];//包含array[i]的连续数组最大值
            dp[0] = array[0];
            for(int i = 1;i < array.length;i++){
                dp[i] = Math.max(dp[i-1]+array[i],array[i]);
                max = Math.max(max,dp[i]);
            }
            return max;
        }
}
