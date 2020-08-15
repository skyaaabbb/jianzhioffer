package JianzhiOfferJAVA;

import java.util.Scanner;

public class SumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        SumTest s = new SumTest();
        System.out.println( s.work(n) );
        //s.work(n);
    }
    public int work (long n) {
        // write code here
        long num = 0; //连续求和的值
        long r;//每次取到（n/i）结果的最大的i取值
        for (long i = 1; i <= n; i=r+1) {
            r = n/(n/i);//取到（n/i）结果的i取值的下边界
           num += n/i*(r-i+1);//结果（n/i）与取到它的次数相乘，在连续求和
        }
        return (int) (num % 998244353);
    }
}
