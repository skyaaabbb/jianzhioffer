package offertest;

import java.util.Scanner;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * 解题思路：
 * 两个数异或：相当于每一位相加，而不考虑进位；
 * 两个数相与，并左移一位：相当于求得进位；
 * 将上述两步的结果相加（重复以上计算直到不再有进位）
 */
public class Sum {
    //测试方法
    public static void main(String[] args){
        System.out.println("请输入两个数：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        num1 = Add(num1, num2);
        System.out.println("sum = "+ num1);
    }
    //实现方法
        public static int Add(int num1,int num2) {
            while(num2 != 0){
                int temp = num1 ^ num2;
                num2 = (num1 & num2) << 1;
                num1 = temp;
            }
            return num1;
        }
}
