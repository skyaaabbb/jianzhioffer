package newCoder;

/**
 * 移动字母
 * 解题思路：
 * 遍历字符串，将不是字母a的字母
 */
public class QingTong01 {
    public static void main(String[] args) {
        String s = "aabcbdevi";
        QingTong01 t = new QingTong01();
        System.out.println(t.change(s));
        System.out.println(t.change01(s));
    }
 /*
    * @param s string字符串
     * @return string字符串
     */
 //方式一，当遍历到字母不是a时，将字母与前面是a的字母交换
    public String change (String s) {
        // write code here
        char[] str = s.toCharArray();
        StringBuilder t = new StringBuilder();
        int length = s.length();
        int j = 0;
        for (int i = 0; i < length; i++) {
            if(str[i] != 'a')
                swap(str,i,j++);
        }
        for(char c : str)
            t.append(c);
        return t.toString();
    }

    private void swap(char[] str, int i, int i1) {
        char temp = str[i];
        str[i] = str[i1];
        str[i1] = temp;
    }
    //方法二 辅助字符串
    public String change01(String s){
        StringBuilder st = new StringBuilder();
        int count = 0;//统计a的个数
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != 'a')
                st.append(s.charAt(i));
            else
                count++;
        }
        //在末尾追加字母a
        for (int i = 0; i < count; i++) {
            st.append('a');
        }
        return  st.toString();
    }
}
