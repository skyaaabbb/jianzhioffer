package offertest;

import java.util.Scanner;

/*
问题描述：求1+2+3+...+n，
要求不能使用乘除法、for、while、if、else、switch、case等
关键字及条件判断语句（A?B:C）。
 */
public class SumN {
    //测试方法
    public static void main(String[] args) {
        System.out.println("请输入数字n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("计算1~"+n+"的和：");
        int result = Sum_Solution(n);
        System.out.println(result);
    }
    //实现方法   1+2+3+4+...+n = (1+n)*n/2
     public static int Sum_Solution(int n) {
          int sum = (int) (Math.pow(n,2)+n);
          return sum >> 1;
     }
}

