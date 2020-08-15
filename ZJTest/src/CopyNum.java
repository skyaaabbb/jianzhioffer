import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CopyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(numResult(n, m));
    }

    private static int numResult(int n, int m) {
        int count = 0;
        if (n < 4 || n > m)
            return -1;
        return 0;
    }
}
