package offertest;

import java.util.Arrays;
import java.util.Collections;

public class OnlyNumTimes {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2,5,1,4,6};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(array,num1, num2);
    }
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length < 2){
            return;
        }
        int temp = 0;
        //所有数据进行异或运算，结果为两个只出现一次的数据的异或结果
        for(int i = 0; i < array.length; i++){
            temp ^= array[i];
        }
        int flag = 1;
        //异或结果与1进行与运算，结果为0时就将1左移一位，继续与运算，找出最低非0位。
        while((temp & flag) == 0){
            flag <<= 1;
        }
        for(int i = 0; i < array.length; i++){
            if((array[i] & flag) == 0){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
        System.out.println("两个只出现一次的数是：" +num1[0] +"\t"+num2[0]);
    }
}
