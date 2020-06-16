package offertest;

import java.util.ArrayList;

/**
 * 问题描述：在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        int[] duplication = new int[1];
        System.out.println(Duplicate(nums,nums.length,duplication));
        System.out.println(Duplicate1(nums,nums.length,duplication));
    }
    //实现方法一 时间复杂度O(n)，空间复杂度O(1)
    public static boolean Duplicate(int[] nums,int length,int[] duplication) {
        for (int i = 0; i < length; i++) {
            if (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {//重复数字
                    duplication[0] = nums[i];
                    return true;
                } else {
                    swap(nums, i, nums[i]);
                }
            }
        }
        return false;
    }
//交换数字，将数字i调整至第i个位置上
    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];//将下标是nums[i]的数字赋值给下标为i的位置
        nums[j] = t;//即nums[nums[i]] = nums[i]
    }
    //实现方法二（自己编写）时间复杂度O（n），空间复杂度O（n）
    public static boolean Duplicate1(int[] nums,int length,int[] duplication) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if(list == null || !list.contains(nums[i])){
                list.add(nums[i]);
            }else{
                duplication[0] = nums[i];
                return true;
            }
        }
        return false;
    }
}
