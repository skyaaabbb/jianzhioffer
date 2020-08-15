package JianzhiOfferJAVA;

import java.util.Scanner;

public class StringTrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(trueOrFalse(s));
    }

    private static boolean trueOrFalse(String s) {
        //不满足字符长度
        if(s.length() <= 0 || s == null)
            return false;
        //长度为1
        if(s.length() == 1)
            return true;
        //首字母是大写字母情况
        if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
            if(s.charAt(1) >= 'A' && s.charAt(1) <= 'Z'){//第二个字母也是大写字母
                for (int i = 2; i < s.length(); i++) {
                    if(s.charAt(i) < 'A' || s.charAt(i) > 'Z')
                        return false;
                }
                return true;
            }else if(s.charAt(1) >= 'a' && s.charAt(1) <= 'z'){//第二个字母是小写字母
                for (int i = 2; i < s.length(); i++) {
                    if(s.charAt(i) < 'a' || s.charAt(i) > 'z')
                        return false;
                }
                return true;
            }
        }else if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){//首字母是小写字母情况
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i) < 'a' || s.charAt(i) > 'z')
                    return false;
            }
            return true;
        }
        return false;
    }
}
