import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchNumber {
    /**
     * 给定一个非空数组，除了某个元素，其他元素均出现两次，
     * 找出这个只出现了一次的元素
     */
    public static void main(String[] args) {
        //Integer[] list2 = new Integer[]{7,8,9,7,8,9,4};
        //ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println("输入一个数组：");
       Scanner sc = new Scanner(System.in);
       int length = sc.nextInt();
       ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < length; i++){
            list.add(sc.nextInt());
      }
       System.out.println(list);
        int result = searchNum(list);
        System.out.println("只出现一次的元素是："+result);
    }
    public static int searchNum(ArrayList<Integer> list){
        List<Integer> list1 = new ArrayList<>();
        list1.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            Integer value = list.get(i);
           if(!list1.contains(value)|| list1.size() == 0) {
               list1.add(value);
           }else{
               list1.remove(value);
           }
        }
        return list1.get(0);
    }
}
