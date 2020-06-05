package offertest;

import java.util.Scanner;

/**
 * 问题描述：求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class NumberOf1F1ToN {
    //测试方法
    public static void main(String[] args) {
        System.out.println("请输入n的值：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NumberOf1Between1AndN_Solution(n));
    }
    //实现方法
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        while(n > 0){
            String str =String.valueOf(n);//将数字类型转换成字符串
            char[] chars = str.toCharArray();//将字符串转换成字符数组
            for(int i = 0; i < chars.length; i++){
                if(chars[i] == '1'){
                    count++;
                }
            }
            n--;
        }
        return count;
    }
}
