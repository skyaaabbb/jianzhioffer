package offertest;

/**
 * 问题描述：请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * 知识点：正则表达式
 */
public class MatchesNumber {
    public static void main(String[] args) {
        char[] str = {'5','e','2'};
        System.out.println(isNumberic(str));
    }
//匹配字符串
    private static boolean isNumberic(char[] str) {
        String rex = "[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?";
        if(str == null || str.length <= 0)
            return false;
        return new String(str).matches(rex);
    }
}
