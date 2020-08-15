package JianzhiOfferJAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        double[][] point = new double[M + 1][2];
        point[0][0] = sc.nextDouble();//X
        point[0][1] = sc.nextDouble();//Y
        for (int i = 1; i <= M; i++) {
            point[i][0] = sc.nextDouble();
            point[i][1] = sc.nextDouble();
        }
        //寻找距离最近的坐标
       double min = Math.sqrt(Math.pow((point[1][0] - point[0][0]),2) + Math.pow((point[1][1] - point[0][1]),2));
        for (int i = 2; i <= M ; i++) {
            double s = Math.sqrt(Math.pow((point[i][0] - point[0][0]),2) + Math.pow((point[i][1] - point[0][1]),2));
            if(s < min)
                min = s;
        }
        double time = min / (double) N;
        DecimalFormat dt = new DecimalFormat("#.00");
        System.out.println(dt.format(time));
    }
}
