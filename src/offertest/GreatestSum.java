package offertest;

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
