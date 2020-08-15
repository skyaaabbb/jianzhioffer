import java.util.Arrays;

public class ExchangeNum {
        public static int[] sovle (int[] a, int n, int m) {
            // write code here
            if(a.length < m || a.length < n)
                return a;
            int[] b = Arrays.copyOf(a,a.length);
            Arrays.sort(b);
            int j = 0; int k = 0; int temp = 0;
            j = b[b.length - n];
            k = b[b.length - m];

            for(int i = 0; i < a.length; i++){
                if(a[i] == j)
                    j = i;
                if(a[i] == k)
                    k = i;
            }
            temp = a[j];
            a[j] = a[k];
            a[k] = temp;
            return a;
        }

    public static void main(String[] args) {
        int[] arrary = {1, 3, 7, 90, 19 ,11};
        int[] result = sovle(arrary, 1, 7);
        System.out.println(Arrays.toString(result));
    }

}
