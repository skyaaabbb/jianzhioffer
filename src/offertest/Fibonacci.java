package offertest;

/**
 * 问题描述：大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 * 斐波那契数列特点：f(0) = 0; f(1) = 1; f(n) = f(n - 1) + f(n - 2) ( n >= 2)
 */
public class Fibonacci {
    //测试方法
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Fibonacci(n));
    }
    //实现方法
    public static int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int first = 0;
        int second = 1;
        int fN= 0;
        for(int i = 2; i <= n; i++){
            fN = first + second;
            first = second;
            second = fN;
        }
        return fN;
    }
}
