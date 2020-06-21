package offertest;

/**
 * 替换空格
 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class String02 {
    public String replaceSpace(StringBuffer str) {
        String str1 = str.toString();
        //统计空格个数
        int cnt = 0;
        for(int i = 0;i < str1.length();i++){
            if(str1.charAt(i) == ' '){
                cnt++;
            }
        }
        //新字符数组的长度
        char[] str2 = new char[str1.length() + 2*cnt];
        //从尾到头替换空格
        for (int i = str1.length() - 1,j = str2.length - 1; i >= 0 ; i--) {
            if(str1.charAt(i) == ' '){
                str2[j--] = '0';
                str2[j--] = '2';
                str2[j--] = '%';
            }else{
                str2[j--] = str1.charAt(i);
            }
        }
        //转换类型
        StringBuffer str3 = new StringBuffer();
        for(int i = 0; i < str2.length; i++)
            str3.append(str2[i]);
        return str3.toString();
    }
}
