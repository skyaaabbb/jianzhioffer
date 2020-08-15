import java.util.Scanner;

public class ShuziChaiFen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//输入的组数
        long[] nums = new long[t];//输入t个n的值
        for (int i = 0; i < t; i++) {
            nums[i] = sc.nextLong();
        }
        int[] result = findK(nums,t);//存放结果的数组
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] findK(long[] nums, int t) {
        int[] k = new int[t];
        //对t个n分别求它们的最小k
        for (int i = 0; i < t; i++) {
            int k1 = 1;
            while ( Math.pow(2,k1) <= nums[i]){
                k1++;
            }
            k[i] = k1;
            }
        return k;
        }
        //return k;
}
