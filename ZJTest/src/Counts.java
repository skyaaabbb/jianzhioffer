import java.util.*;
import java.math.BigInteger;

public class Counts {
    /**
     *
     * @param a int整型
     * @param b int整型
     * @param n int整型
     * @return int整型
     */
    public int solve (int a, int b, int n) {
        // write code here
        long result = 0L;
        long A = a;
        long B = b;
        if(n == 1) return a;
        if(n == 2) return b;
        for(int i = 3; i <= n; i++){
            result = A + B;
             A = B;
             B = result;
        }
        return (int) result % 1000000007;
    }
}