package offertest;

import java.util.Scanner;

/**
 * 问题描述：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 知识点：进制转换
 * (n-1) & n可将其最后一位变为0，每次循环可将其从右端起最末位不为0的数字变为0
 * 时间复杂度：O(n)
 */
public class NumberOf1Test {
    // 测试方法
    public static void main(String[] args) {
        System.out.println("请输入n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = NumberOf1(n);
        System.out.println(number);
    }
    //实现方法
    public static int NumberOf1(int n) {
        int number = 0;
        while(n != 0){
            number ++;
            n = (n-1) & n;
        }
        return number;
    }
}
