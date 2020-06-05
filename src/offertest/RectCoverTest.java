package offertest;

import java.util.Scanner;

/**
 * 问题描述：
 *我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 * 知识点：递归
 */
public class RectCoverTest {
    //测试方法
    public static void main(String[] args) {
        System.out.println("输入n的大小：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = RectCover(n);
        System.out.println(result);
    }
    //实现方法
    public static int RectCover(int target) {
        if(target <= 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        int first = 1;
        int second = 2;
        int result = 0;
        for(int i = 3; i <= target; i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
