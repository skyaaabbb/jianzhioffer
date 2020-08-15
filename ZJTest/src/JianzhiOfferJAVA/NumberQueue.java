package JianzhiOfferJAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= 2*n; i++) {
            if(i % 2 == 1)
                sum += 1.0/(5 * i);
            else
                sum -= 1.0/(5 * i);
        }
        DecimalFormat dt = new DecimalFormat("0.0000");
        System.out.println(dt.format(sum));
    }
}
