package offertest;

import java.util.Scanner;

/**
 * 问题描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
 * （先后次序不同算不同的结果）。
 * 知识点：递归 可用循环实现
 */
public class JumpFloorI {
    //测试方法
    public static void main(String[] args) {
        System.out.println("请输入台阶数：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(JumpFloor(target));
        System.out.println(JumpFloor2(target));
    }
    //实现方法一 递归
        public static int JumpFloor(int target) {
            if(target <= 0) return 0;
            if(target == 1) return 1;
            if(target == 2) return 2;
            return JumpFloor(target -1) +JumpFloor(target - 2);
        }
        //实现方法二 循环
    public static int JumpFloor2(int target){
            if(target <= 0) return 0;
            if(target == 1) return 1;
            if(target == 2) return 2;
            int first = 1;
            int second = 2;
            int result = 0;
            for(int i = 3; i <= target;i++){
                result = first + second;
                first = second;
                second = result;
            }
            return result;
    }
}
