import java.text.StringCharacterIterator;
import java.util.*;
import java.math.*;
public class Test01 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();//进制数
            int m = in.nextInt();//除数
            BigInteger a = in.nextBigInteger(n);//nextBigInteger中的参数代表读入数的进制，默认为10，范围为2-36。
            System.out.println(a);

        }

    }
