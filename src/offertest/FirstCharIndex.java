package offertest;
/**
 * 问题描述：在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到
 * 第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * （从0开始计数）
 */

import java.util.*;

public class FirstCharIndex {
    //测试方法
    public static void main(String[] args) {
        String str = "abcacbde";
        System.out.println(FirstNotRepeatingChar1(str));
        System.out.println(FirstNotRepeatingChar2(str));
        System.out.println(FirstNotRepeatingChar3(str));
    }
    //实现方法一
    //map保存对应字符出现的次数
    public static int FirstNotRepeatingChar1(String str) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        //List<Character> list = new ArrayList<Character>();
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            //list.add(chars[i]);
            if(map == null || !map.containsKey(chars[i])){
                map.put(chars[i],1);
            }else{
                int cnt = map.get(chars[i]);
                map.put(chars[i],++cnt);
            }
        }
        for(int i = 0; i < chars.length; i++){
            if(map.get(chars[i]) == 1){
                //return list.indexOf(chars[i]);
                return i;
            }
        }
        return -1;
    }
    //方法二 用整型数组代替HashMap
    public static int FirstNotRepeatingChar2(String str){
        int[] cnt = new int[256];
        //遍历统计字母出现的次数
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i)]++;
        }
        //遍历找出第一个仅出现一次的字母位置
        for (int i = 0; i < str.length(); i++) {
            if(cnt[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
    //方法三 用两个比特位存储出现的次数
    public static int FirstNotRepeatingChar3(String str){
        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);
        //遍历统计字母出现的次数
        for (char c:str.toCharArray()) {
            if(!bs1.get(c) && !bs2.get(c))
                bs1.set(c);//0 0 ----> 0 1
            else if(bs1.get(c) && !bs2.get(c))
                bs2.set(c);// 0 1 -----> 1 1
        }
        //遍历找出第一个仅出现一次的字母位置
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(bs1.get(c) && !bs2.get(c))
                return i;
        }
        return -1;
    }
}
