package offertest;

import java.util.Scanner;

/**
 * 问题描述：统计一个数字在排序数组中出现的次数。
 * 知识点：二分法查找
 */
public class GetNumberOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入k：");
        int k = sc.nextInt();
        System.out.println("请输入数组array长度：");
        int length = sc.nextInt();
        System.out.println("请输入数组array：");
        int[] array = new int[length];
        for (int i = 0; i < length ; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(GetNumberOfK(array, k));
    }
    //查找K的个数
    public static int GetNumberOfK(int[] array, int k) {
        int number = 0;
        if (array.length > 0) {
            int firstK = GetFirstK(array, k, 0, array.length - 1);
            int endK = GetEndK(array, k, 0, array.length - 1);
            if (firstK > -1 && endK > -1) {
                number = endK - firstK + 1;
            }
        }
        return number;
    }

    //查找第一个k的位置
    public static int GetFirstK(int[] array, int k, int start, int end) {
        if (start > end) return -1;
        int middle = (start + end) / 2;
        int middleDate = array[middle];
        if (middleDate == k) {
            if (array[middle - 1] != k && middle > 0 || middle == 0) {
                return middle;
            } else {
                end = middle - 1;
            }
        } else if (middleDate > k) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
        return GetFirstK(array, k, start, end);
    }

    //查找最后一个k的位置
    public static int GetEndK(int[] array, int k, int start, int end) {
        if (start > end) return -1;
        int middle = (start + end) / 2;
        int middleDate = array[middle];
        if (middleDate == k) {
            if (array[middle + 1] != k && middle < array.length - 1
                    || middle == array.length - 1) {
                return middle;
            } else {
                start = middle + 1;
            }
        }else if (middleDate > k) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
        return GetEndK(array, k, start, end);
    }
}