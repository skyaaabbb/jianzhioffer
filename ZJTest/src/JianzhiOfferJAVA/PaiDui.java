package JianzhiOfferJAVA;

import java.util.Scanner;

public class PaiDui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        PaiDui s = new PaiDui();
        int result = s.solve(n,arr);
        System.out.println(result);
    }
    public int solve (int n, int[] a) {
        // write code here
        int cur = 0;
        int step = 0;
        while(a[cur] != 0){
            cur++;
            step++;
            if(cur == n)
                cur = 0;
            a[cur] -= (step / n) *n + (step % n);
            if(a[cur] == 0)
                return cur + 1;
        }
        return 0;
    }
}
