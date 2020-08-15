package JianzhiOfferJAVA;

public class Climb {
    public static void main(String[] args) {
        int len = 10,m = 4,n = 3;
        System.out.println(daycost(len,m,n));
    }
    public static int daycost (int len, int m, int n) {
        // write code here
        if(n > m && len  > m )
            return -1;
        int day = 0;
        /*
        *  while(len > 0){
            day++;
            len -= m;
            if(len > 0)
                len += n;
        }
        */while(len - m > 0){
            len -= (m - n);
            day++;
        }

        //day = (len - m)/(m - n) + 1;
        return day + 1;
        //return day;
    }
}
