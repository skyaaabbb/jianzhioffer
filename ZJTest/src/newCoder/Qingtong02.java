package newCoder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

/**
 * 魔法数字
 * 备注：(1≤n,m≤1000)
 * 解题思路：
 * 方法一：
 * 当m <= n 时，只能一直执行减一操作，所以需要有 n- m次操作
 * 当m > n 时，求平方数距离m最近的数字k，当k> n时，重复以上过程
 * 需要的最少操作次数就是min（m - n，solve（k，n）+ 1 + Math.abs(m - k * k)）
 * 方法二：
 * 从n开始，计算n - 1,n + 1, n * n 操作，并记录操作次数dp[n - 1],dp[n + 1],dp[n * n]都等于dp[n] + 1。
 * 直到找到dp[m]。
 *
 */
public class Qingtong02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Qingtong02 t = new Qingtong02();
        int count = t.solve(n,m);
        System.out.println(count);
        System.out.println(t.solve01(n,m));
    }

    private int solve(int n, int m) {
        if(m <= n)
            return n - m;
        int k = (int) Math.sqrt(m);
        if( m - k * k > (k + 1)*(k + 1) - m )k++;
        return Math.min(m - n,solve(n,k) + 1 + Math.abs(m - k * k));
    }
    public int solve01 (int n, int m) {
        if(n==m) return 0;
       // Vector<Integer> v = new Vector<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] d = new int[2001];
        queue.add(n);
        while(!queue.isEmpty()){
            int k = queue.poll();
            if(k-1>0&&d[k-1]==0){
                d[k-1] = d[k]+1;
                queue.add(k-1);
            }
            if(k+1<=2000&&d[k+1]==0){
                d[k+1] = d[k]+1;
                queue.add(k+1);
            }
            if(k*k<=2000&&d[k*k]==0){
                d[k*k] = d[k]+1;
                queue.add(k*k);
            }
        }
        return d[m];
    }
}
