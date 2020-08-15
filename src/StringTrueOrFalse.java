import java.util.Scanner;

/**
 * 题目描述：
 * 给定一个字符串 S，如果 S 满足以下要求中的任意一个则返回 true，否则返回 false:
 * 1. 全部都是大写字母，比如 "BILIBILI"
 * 2. 全部都是小写字母，比如 "bilibili"
 * 3. 首字母大写，比如 "Bilibili"
 */
public class StringTrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        while (sc.hasNext()) {
            str.append(sc.nextLine());
        }
        //判断是否合法
        System.out.println(isFlag(str));
    }

    //判断是否符合规则
    private static boolean isFlag(StringBuilder str) {
        if (str == null)
            return false;
        if(str.length() == 1)
            return true;
        if(str.length() == 2 && str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
            return true;
        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    continue;
                else
                    return false;
            }
            return true;
        }
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            if (str.charAt(1) >= 'A' && str.charAt(1) <= 'Z') {
                for (int i = 2; i < str.length(); i++) {
                    if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                        continue;
                    else
                        return false;
                }
                return true;
            }else {
                if (str.charAt(1) >= 'a' && str.charAt(1) <= 'z')
                    for (int i = 2; i < str.length(); i++) {
                        if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                            continue;
                        else
                            return false;
                    }
                return true;
            }
        }
        return false;
    }
}
