import java.math.BigInteger;
import java.util.Scanner;

/**
 * 两个大数相乘
 */
public class BigNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.nextLine());
        BigInteger num2 = new BigInteger(sc.nextLine());
        BigInteger result = num1.multiply(num2);
        System.out.println(result);
    }
}
