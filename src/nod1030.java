import java.util.Scanner;
import java.math.BigInteger;

public class nod1030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String divisor = scanner.next();
            divisor = checkDivisor(divisor, n);
            System.out.println("合法divisor:" + divisor);
//            String num = scanner.next();
            int divisorNum = Integer.parseInt(divisor, n);
            System.out.println("转换进制后divisor:" + divisorNum);
            int result = divisorNum % m;
            System.out.println(result);
        }

    }

    private static String checkDivisor(String divisor, int n) {
        char[] array = divisor.toCharArray();
        if (n < 1 || n > 36) {
            System.out.println("进制错误");
            return "";
        }
        if (n >=1 && n <= 10) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= (n + 48)) {
                    return divisor.substring(0, i);
                }
            }
        }
        if (n > 10) {
            for (int i = 0; i <array.length; i++) {
                if (array[i] <= 'z' && array[i] >= 'a') {
                    if (array[i] > (n + 86)) {
                        return divisor.substring(0, i);
                    }
                }
            }
        }
        return divisor;
    }

    static BigInteger change(String a, int i, int j) {
        return new BigInteger(a, i);
    }
}
