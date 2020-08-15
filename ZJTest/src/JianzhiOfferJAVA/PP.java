package JianzhiOfferJAVA;

import java.util.PriorityQueue;

public class PP {

    public static void main(String[] args) {
        int n = 4;
        int[] a = {2, 3, 4, 5};
        int k = 2;
        solve(n, a, k);
    }

    public static int solve (int n, int[] a, int k) {
        PriorityQueue<Integer > qp = new PriorityQueue<Integer>((c, b)->b-c);
        for(int i: a){
            qp.offer(i);
        }
        int time  = 0  ;
        while(!qp.isEmpty() &&qp.peek()>time ){
            time++;
            int dry = qp.remove();
            dry -=k;
            if(dry>time) qp.add(dry+1);
        }
        return time;
    }
}
