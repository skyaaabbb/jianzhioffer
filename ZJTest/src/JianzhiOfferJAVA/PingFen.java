package JianzhiOfferJAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PingFen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] score = new int[5];
        if(score.length <= 0 || score == null)
            System.out.println("0.0");
        for (int i = 0; i < 5; i++) {
            score[i] = sc.nextInt();
        }
        //计算平均评分
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            sum += ((i + 1) * score[i]);
            count += score[i];
        }
        double avg = sum / (double)count;
        String s = new String(avg +" ");
        System.out.println(s.substring(0,3));

        DecimalFormat dt = new DecimalFormat("0.0");
        System.out.println(dt.format(avg));
    }
}
