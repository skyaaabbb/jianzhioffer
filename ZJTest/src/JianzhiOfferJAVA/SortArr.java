package JianzhiOfferJAVA;

public class SortArr {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {6,5,4};
        SortArr arr = new SortArr();
        int[] result = arr.sort(a,b);
        for (int i: result) {
            System.out.println(i);
        }
    }
    public int[] sort (int[] a, int[] b) {
        // write code here
        int[] c = new int[a.length + b.length];
        int i = 0, j = b.length - 1,k = 0;
        for(; i < a.length && j >= 0;){
            if(a[i] <= b[j]){
                c[k++] = a[i];
                i++;
            }else{
                c[k++] = b[j];
                j--;
            }

        }
        while (i < a.length){
            c[k++] = a[i++];
        }
        while (j >= 0){
            c[k++] = b[j--];
        }
        return c;
    }
}
