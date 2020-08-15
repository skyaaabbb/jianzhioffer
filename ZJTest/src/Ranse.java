import java.util.Scanner;

public class Ranse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        long[][] arr = new long[T][2];
        //输入T组N、M数据
        for (int i = 0; i < T; i++) {
            arr[i][0] = sc.nextLong();
            arr[i][1] = sc.nextLong();
        }
        //保存结果
        long[] result = new long[T];
        for (int i = 0; i < T; i++) {
            result[i] = findCount(arr[i],T);
        }
        for (long i: result) {
            System.out.println(i);
        }
    }

    private static long findCount(long[] arr, int t) {
        //不满足的条件
        if(t <= 0 || arr[0] <= 0 || arr[1] <= 0 || arr == null)
            return 0;
        //min用来保存N、M中的最小数
        long min = 0;
        //1*1的矩阵
            if(arr[0] == 1 && arr[1] == 1)
                return 1;
            else{
                //一行的情况
                if(arr[0] == 1)
                   min  = arr[1];
                //一列的情况
                else if(arr[1] == 1)
                    min = arr[0];
                else
                    //多行多列的情况
                    min = Math.min(arr[0],arr[1]);

            }
            //求最小质因数
        for (long i = 2; i < min / 2; i++) {
            if(min % i == 0){
                return i;
            }
        }
        return min;
    }
}
