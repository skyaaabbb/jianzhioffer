package offertest;

import java.util.Scanner;

/**
 * 问题描述：给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 知识点：贪心
 */
public class CuttingMul {
    //测试方法
    public static void main(String[] args) {
        System.out.println("请输入绳子长度：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("最大乘积为："+cutRope(target));
    }
    //实现方法
        public static int cutRope(int target) {
            //贪心算法
            //绳子长度大于等于5时尽可能多的剪成长度为3的段，
            //长度<=4时，尽可能多的剪成长度为2的段
            if(target < 2) return 0;
            if(target == 2) return 1;
            if(target == 3) return 2;
            int timesOf3 = target/3;//最多可剪成长度为3的次数
            //绳子长度为4时
            if(target - timesOf3 * 3 == 1){
                timesOf3 -= 1;
            }
            int timesOf2 = (target - timesOf3 *3)/2;
            return (int)(Math.pow(3,timesOf3) * Math.pow(2,timesOf2));

        }
}
