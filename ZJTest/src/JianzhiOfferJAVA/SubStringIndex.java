package JianzhiOfferJAVA;

public class SubStringIndex {
    public static void main(String[] args) {
        String s = "this is an easy problem.";
        String t = "easy";
        SubStringIndex str = new SubStringIndex();
        System.out.println(str.match_str_in_sentence(s,t));
    }
    public int match_str_in_sentence (String s, String x) {
        // write code here
        String[] st = s.split(" ");
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }

        for (int i = 0; i < st.length;i++) {
            int j = 0;
            for(int m = 0; m < st[i].length() && j < x.length();){
                if(st[i].charAt(m) == x.charAt(j)){
                    m++;
                    j++;
                }else break;
            }
            if(j == x.length() && st[i].length() > x.length())
                return i;
        }
        return -1;

    }
}
