package JianzhiOfferJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class DaiJinQuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        int maxVal = maxValue(value);
    }

    private static int maxValue(int[] value) {
        int maxVal = 0;
        Arrays.sort(value);
        for (int i = value.length - 1; i > 0 ; i--) {
            if(value[i] == value[i - 1]){
                value[i - 1] += 1;
                i--;
            }

        }
        return maxVal;
    }
}
