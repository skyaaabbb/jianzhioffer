package offertest;

import java.util.Scanner;

/**
 * 问题描述：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 */
public class PowTest {
    //测试方法
    public static void main(String[] args) {
        System.out.println("请输入底数和指数：");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        int exponent = sc.nextInt();
        System.out.println(Power(base,exponent));
    }
    //实现方法
        public static double Power(double base, int exponent) {
            if(base == 0 && exponent == 0){
                System.out.println("没有意义");
                return -1;
            }
            if(base == 0 && exponent != 0){
                return 0;
            }
            if(base != 0 && exponent == 0){
                return 1;
            }
            return (double)Math.pow(base,exponent);
        }
}
