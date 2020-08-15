package JianzhiOfferJAVA;

public class ReverWords {
    public static void main(String[] args) {
        String str = "I am a student.";
        ReverWords s = new ReverWords();
        System.out.println(s.ReverseSentence(str));

    }
    public String[] ReverseSentence(String str) {
        //切分单词
        String[] t = str.split(" ");
        String[] temp = new String[t.length];
        //每个单词后连接一个空格
        for (int i = 0; i < t.length; i++) {
            temp[i] = t[i] + " ";
        }
        //翻转单词
        reverse(temp,0,temp.length - 1);
        return temp;
    }
    public void reverse(String[] c,int i,int j){
        while(i < j)
            swap(c,i++,j--);
    }
    public void swap(String[]c,int i,int j){
        String t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
