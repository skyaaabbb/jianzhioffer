import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ZhongCao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n株草
        int m = sc.nextInt();//m个助长液
        int x = sc.nextInt();//每个助长液可以助长的高度
        int[] hi = new int[n];//n株草每株草的高度
        HashMap<Integer,Integer> map = new HashMap<>();//存储没用助长液是最矮的草的高度及用完助长液其高度
        for (int i = 0; i < n; i++) {
            hi[i] = sc.nextInt();
        }
        Arrays.sort(hi);//排序
        int temp = hi[0];//最矮的草的原高度
        hi[0] += x;//使用助长液一次
        int count = 1;
        map.put(0,temp);
        map.put(1,hi[0]);
        m--;
        count(hi,m,map,x,count);
        //System.out.println(map.get(1));
    }

    private static void count(int[] hi, int m, HashMap<Integer, Integer> map,int x,int count) {
        while(m > 0){
            for (int i = 1; i < hi.length; i++) {
                if(hi[i] > map.get(1) + x * count ){//统计n株草中比最矮的草使用助长液后矮的株数
                    int index = i;
                    m -= i -1;
                    if(m > 0){
                        hi[0] += x;
                        map.put(1,hi[0]);
                        m--;
                        count ++;
                    }
                    for (int j = 1; j < i; j++) {//比最矮的草使用助长液后矮的株数使用助长液
                        hi[j] += x;
                    }
                }
            }
        }
        System.out.println(map.get(1));
    }
}
