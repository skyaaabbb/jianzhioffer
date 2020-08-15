import java.math.BigInteger;
/**
 * #include<bits/stdc++.h>
 * using namespace std;
 * const double pi=acos(-1);
 * int main()
 * {
 *     int s;scanf("%d",&s);
 *     printf("%.3lf\n",2.0*sqrt(s/pi));
 *     return 0;
 * }
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class RecPow {
    public static double pi = Math.acos(-1);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        double p = doubleR(area);
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        System.out.println(decimalFormat.format(p));
    }

    private static double doubleR(int area) {
        double r = 2.0 * Math.sqrt(area / pi);
        return r;
    }
}
