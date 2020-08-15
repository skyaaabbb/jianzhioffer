import java.util.Scanner;

/**
 * 找零
 * Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，
 * 以及面值1024元的纸币。现在小Y使用1024元的纸币购买了一件价值为N
 * (0 < N \le 1024)N(0<N≤1024)的商品，请问最少他会收到多少硬币？
 * 对于100%的数据，N (0 < N \le 1024)N(0<N≤1024)。
 */
public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = change(N);
        System.out.println(count);
    }

    private static int change(int n) {
        if(n == 1024)
            return 0;
        int total = 1024 - n;
        int countOf64 = 0, countOf16 = 0,countOf4 = 0,countOf1 = 0;
        if( total >= 64){
             countOf64 = total / 64;
            total -= countOf64 * 64;
        }
        if(total >= 16){
            countOf16 = total / 16;
            total -= countOf16 * 16;
        }
        if(total >= 4){
            countOf4 = total / 4;
            total -= countOf4 * 4;
        }
        if(total >= 1){
            countOf1 = total;
        }
        return countOf64 + countOf16 + countOf4 + countOf1;
    }
}
