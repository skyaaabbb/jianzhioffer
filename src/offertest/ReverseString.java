package offertest;

/**
 * 问题描述：汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
 * 就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
 * 请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 知识点：字符串
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "abcXYZdef";
        int n = 3;
        System.out.println(LeftRotateString(str,n));
        System.out.println(remoteString(str,n));
    }
    //实现方法一
    public static String LeftRotateString(String str,int n) {
        //保证旋转的位数大于字符串的长度，否则返回空字符串
        if(n>str.length())
            return "";
        //把原字符串截取成俩字符串，然后拼接
        String s1 = str.substring(0, n);
        String s2 = str.substring(n,str.length());
        return s2 + s1;
    }
    //实现方法二
    public static String remoteString(String str,int n){
        reverse(str,0,n - 1);
        reverse(str,n,str.length() - 1);
        reverse(str,0,str.length() - 1);
        return str;

    }
//实现翻转
    private static void reverse(String str, int i, int i1) {
        char[] chars = str.toCharArray();
        char temp;
        for(int m = i,j = chars.length -1; m < j; m++,j--){
            temp = chars[m];
            chars[m] = chars[j];
            chars[j] = temp;
        }
    }
}
