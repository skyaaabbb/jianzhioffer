package JianzhiOfferJAVA;

import java.util.Scanner;

public class YouHui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        handle(arr);
    }
    public static void handle(int[][] arr){
    int sumValue = 0;
    int save = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0] >= arr[i][1]){
                sumValue += arr[i][0];
                save += arr[i][1];
            }else{
                sumValue += arr[i][1];
                save += arr[i][1];
            }
        }
        System.out.println(sumValue +"\t" + (sumValue - save));
    }
}
