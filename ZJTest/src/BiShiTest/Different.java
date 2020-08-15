package BiShiTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(2);
        different(list);
        System.out.println(list);
    }

    private static ArrayList<Integer> different(ArrayList<Integer> list) {
        //int min = -1;
        int i = 0;
        boolean flag = true;//标记一趟遍历后数组有没有变化
        while(flag){
            int min = -1;//每趟开始遍历时都将min重置为-1
            int len = list.size();//数组长度
            for( i = 0; i < len - 1; i++){//遍历数组
                if((min == -1 && list.get(i) == list.get(i+1))
                        ||(list.get(i) == list.get(i + 1) && list.get(min) > list.get(i)))
                    min = i;
            }
            if(min != -1){
                list.set(min,2 * list.get(min));
                list.remove(min + 1);
            }
            if(len ==list.size())
                flag = false;
        }
        return list;
    }
}
