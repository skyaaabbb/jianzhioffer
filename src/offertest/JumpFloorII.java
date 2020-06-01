package offertest;

import java.util.Scanner;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class JumpFloorII {
    //测试方法
    public static void main(String[] args) {
        System.out.println("请输入台阶数：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int result = JumpFloorII1(target);
        int result1 = JumpFloorII2(target);
        System.out.println(result + "\t"+ result1);
    }
    //实现方法1

    /**
     * 归纳法：target = 1时，temp = 1；target = 2时，temp = 2；target = 3时，temp = 4；。。。
     * 所以temp取值为2的target - 1次方。
     * @param target
     * @return
     */
    public static int JumpFloorII1(int target) {
        int temp = 0;
        if(target != 0)
        {
            //temp = (int)Math.pow(2,target - 1);
            temp = 1 <<(target - 1);//移位运算更快
        }
        return temp;
    }
    //实现方法2

    /**
     * 解题思路:当第一步跳一个时，剩下的台阶有F(n-1)种跳法；
     *          当第一步跳两个台阶时，剩下的台阶有F（n-2）种跳法；
     *          当第一步跳三个台阶时，剩下的台阶有F（n-3）种跳法；
     *          ...
     *          当第一步跳n个台阶时，只有这一种跳法；
     * @param target
     * @return
     */
    public static int JumpFloorII2(int target) {
        if(target == 0) {
            return 0;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i <= target;i++){
            dp[i] = 2 * dp[i-1];
        }
        return dp[target];
    }
}
