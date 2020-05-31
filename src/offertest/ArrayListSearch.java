package offertest;

import java.util.Scanner;
/**
 * 题目描述
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 */
public class ArrayListSearch {
//测试方法
    public static void main(String[] args){
        System.out.println("请输入数组A的长度：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("请为数组A中元素赋值：");
        if(length <= 0){
            System.out.println("数组长度错误！");
        }else{
            int[] A = new int[length];
            for (int i = 0;i < length;i++) {
                A[i] = sc.nextInt();
            }
            int[] B = new int[length];
            B = multiply(A);
            for (int i:B) {
                System.out.print(i +"\t");
            }
        }
    }

    public static int[] multiply(int[] A) {
        int temp = A.length;
        int[] B = new int[temp];
        for(int i = 0; i < temp;i++){
            B[i] = 1;
            for(int j = 0;j < temp - i;j++){
                B[i] *= A[j];
            }
        }
        return B;
    }
}
