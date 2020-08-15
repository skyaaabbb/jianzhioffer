import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();//木棍长度
        System.out.println(maxNum(n));
    }

    private static int maxNum(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        int countOf3 = n / 3;
        n = n - countOf3 * 3;
        if(n == 1){
            countOf3 --;
            n += 3;
        }
            int countOf2 = n / 2;
        return (int)Math.pow(2,countOf2) * (int)Math.pow(3,countOf3);
    }
}
