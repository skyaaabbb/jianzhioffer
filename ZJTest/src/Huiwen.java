import java.util.Scanner;

public class Huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            StringBuilder str = new StringBuilder();
            str.append(sc.next());
            String s = str.toString();
            System.out.println(count(s));
        }
    }
    public static int count(String s){
        int count = 0;
       for(int start = 0, end = s.length() - 1; start < end; start++,end--){
           if(s.charAt(start) != s.charAt(end))
               count++;
       }
       return count;
    }
}
