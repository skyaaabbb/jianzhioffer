package newCoder;

import java.util.Collections;
import java.util.Scanner;

/**
 * 牛妹的春游
 * 解题思路：
 * 每个包装考虑买或不买情况，dp[i][j]存储买面包个数为i，啤酒瓶数为j需要的最少花费。
 * 动态规划：
 * 限制条件（状态）：所需面包breadNum、饮料的总量beverageNum
 * 确定「选择」，也就是导致「状态」产生变化的行为。
 * 选择：大包装
 *
 * 5,60,[[3,36,120],[10,25,129],[5,50,250],[1,45,130],[4,20,119]]
 */
public class QingTong03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breadNum = sc.nextInt();
        int beverageNum = sc.nextInt();
        int n = sc.nextInt();
        int[][] packageSum = new int[n][3];
        for (int i = 0; i < n; i++) {
            packageSum[i][0] = sc.nextInt();
            packageSum[i][1] = sc.nextInt();
            packageSum[i][2] = sc.nextInt();
        }
        QingTong03 t = new QingTong03();

        System.out.println(t.minCost(breadNum,beverageNum,packageSum));
    }
    /**
     *
     * @param breadNum int整型
     * @param beverageNum int整型
     * @param packageSum int整型二维数组 每个一维数组中有三个数，依次表示这个包装里面的面包数量、饮料数量、花费
     * @return int整型
     */
    public int minCost (int breadNum, int beverageNum, int[][] packageSum) {
        // write code here
        int[][] dp = new int[breadNum + 5][beverageNum + 5];
        for (int i = 0; i < breadNum + 5; i++) {
            for (int j = 0; j < beverageNum + 5; j++) {
                dp[i][j] = 0x3f3f3f3f;
            }
        }
        dp[0][0] = 0;
        for (int k = 0; k < packageSum.length; k++) {
            for (int i = breadNum; i >= 0; i--) {
                for (int j = beverageNum; j >= 0; j--) {
                    dp[i][j] = Math.min(dp[i][j],
                            dp[Math.max(0, i - packageSum[k][0])][Math.max(0, j - packageSum[k][1])] + packageSum[k][2]);
                }
            }
        }
        return dp[breadNum][beverageNum];
    }
}
