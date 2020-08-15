package JianzhiOfferJAVA;

import java.util.Scanner;

/**
 * 给定字串A和字符集B，求在A中包含了B所有字符的最小子串
 * 输入描述：
 * 输入一行字串（不会为空）
 * ABAKJSDYUIWNQJNDSAHDBALSDH
 * 输入一个字符集（不会为空，也不会出现重复字符）
 * ABD
 * 输出描述：
 * 输出包含了字符集所有字符的第一个最小子串，例如上面的输入对应输出DBA
 * 如果没有符合条件的子串，则输出#
 */
public class MInSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();//目标串
        String s = sc.nextLine();//匹配子串
        System.out.println(minsubString(t, s));


    }

    private static String minsubString(String t, String s) {
        //不满足的情况
        if (t.length() < s.length() || t == null || s == null || s.length() == 0)
            return "#";
        //模拟哈希表，存储目标字符串的各个字符的个数
        int[] map = new int[255];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
            //双指针遍历源字符串t
            int begin = 0, end = 0;
            //最小字符串的起点
            int minBegin = 0;
            //最小字符串的长度
            int res = Integer.MAX_VALUE;
            //用来记录匹配到字符的个数，如果count == t.length()意味着找到一个匹配的字串
            int count = 0;

            //遍历
            while (end < t.length()) {
                //这里可理解为缺失字符的个数，==0时则表示 这个字符匹配够了，
                // ==1则表示仍需要再匹配一个该字符
                if (map[t.charAt(end)] > 0)
                    count++;
                //不需要匹配的字符，其值此时小于0
                map[t.charAt(end)]--;
                //尾指针右移
                end++;
                //匹配到一个字串
                while (count == s.length()) {
                    //比较字串长度，更新字串信息
                    if (end - begin < res) {
                        res = end - begin;
                        minBegin = begin;
                    }
                    //如果首指针对应字符是目标字符之一，则跳出循环
                    if (map[t.charAt(begin)] == 0)
                        count--;
                    //首指针对应字符的哈希值还原
                    map[t.charAt(begin)]++;
                    //首指针右移
                    begin++;
                }
            }
        return res == Integer.MAX_VALUE ? "#" : t.substring(minBegin, minBegin + res);
    }
}
