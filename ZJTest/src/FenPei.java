import java.math.BigInteger;
import java.util.Scanner;

public class FenPei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(solve(n,x,a));
    }
    public static int solve (int n, int x, int[] a) {
        // write code here
        BigInteger sum = BigInteger.valueOf(0);
        for(int i = 0; i < a.length; i++)
            sum = sum .add(BigInteger.valueOf(a[i] - x));
        BigInteger count = sum.divide(BigInteger.valueOf(x));
        int count1 = count.intValue();
        if(count1 >= 0)
            return n;
        else
            return n - count1;
    }
}
