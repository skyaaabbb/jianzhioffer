package offertest;

import java.util.Scanner;

/**
 * 招银网络科技测试岗提前批
 * 斐波那契数列前n项中1的个数
 */
public class Number1InNFicc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = number1InN(n);
        System.out.println(count);
    }

    private static int number1InN(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        int cnt = 0;
        while(n > 2){
            cnt += Ficc(n--);
        }
        return cnt + 1;
    }

    private static int Ficc(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        int first = 0, second = 1;
        int result = 0;
        int cnt = 0;
        for(int i = 3; i <= n; i++){
            result = first + second;
            first = second;
            second = result;
        }
        while(result != 0 ){
            int temp = result %10;
            if(temp == 1)
                cnt ++;
            //result = result & (result - 1);
            result /= 10;
        }
        return cnt;
    }
}
