package offertest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *问题描述：设计一个函数， 可以将任意十进制的数， 转换成任意2到9的进制表示的形式
 * 输入描述:
 * 需要转换的数字x(0<=x<=1e18) 转换使用的进制k(2<=k<=9)
 * 输出描述:
 * 对应进制的结果
 * 示例1
 * 输入
 * 复制
 * 33 2
 * 输出
 * 复制
 * 100001
 */
public class ChangeNumber {
   /* public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//十进制数
        int m = sc.nextInt();//任意进制
        if((m >= 2 && m <= 9) && (n >= 0 && n <= 1e18)){
            change(n,m);
        }
    }*/
   /*
   * //方法一
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        long n=Long.parseLong(str[0]);
        int m=Integer.parseInt(str[1]);
        System.out.println(Long.toString(n,m));
    }
}*/
   //方法二
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           long x = scanner.nextLong();
           long k = scanner.nextLong();
           System.out.println(radix(x, k));
       }

       private static String radix(long x, long k) {
           StringBuilder sb = new StringBuilder();
           if (x == 0) {
               sb.append(0);
           }
           while (x != 0) {
               sb.append(x % k);
               x /= k;
           }
           return sb.reverse().toString();
       }
    //进制转换
    public static void change(int n, int m){
        List<Integer> list = new ArrayList<Integer>();
        while(n >= m){
            int temp = n % m;
            list.add(0,temp);
            n /= m;
        }
        list.add(0,n);
        System.out.println(list);
        return;
    }
}
