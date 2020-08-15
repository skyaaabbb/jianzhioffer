package JianzhiOfferJAVA;

public class Solution {

    private int count = 0;

    public static void main(String[] args) {
        //int count = 0;
        int[] array = {1, 2, 3, 3, 3, 3, 4, 5};
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.GetNumberOfK(array, k));
    }

    public int GetNumberOfK(int[] array, int k) {
        if (array.length <= 0)
            return 0;
        //int cnt =
        binarySearch(array, 0, array.length - 1, k);
        return count;
    }

    public void binarySearch(int[] array, int l, int h, int k) {
        if (l > h) {
            return;
        }

        int m = (l + h) >> 1;
        if (array[m] == k) {
            count++;
            binarySearch(array, l, m - 1, k);
            binarySearch(array, m + 1, h, k);
        } else if (array[m] > k) {
            binarySearch(array, l, m - 1, k);
        } else if (array[m] < k) {
            binarySearch(array, m + 1, h, k);
        }

    }
}
