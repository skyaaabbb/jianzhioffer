import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//数组个数
        //输入数组元素,数组元素有序
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //输入待查找的数字
        int searchNum = sc.nextInt();
        System.out.println(binarySearchNum(arr,searchNum,0,arr.length - 1));
    }

    private static int binarySearchNum(int[] arr, int searchNum,int start,int end) {
        if(arr.length <= 0) return -1;
        //循环条件
        while(start <= end){
            int mid = start + (end - start)/2;
            if(searchNum == arr[mid])
                return mid;
            if(searchNum < arr[mid])
                //待查找元素只可能在左侧
                return binarySearchNum(arr,searchNum,start,mid - 1);
            if(searchNum > arr[mid])
                //待查找元素只可能在右侧
                return binarySearchNum(arr,searchNum,mid + 1,end);
        }
        return -1;
    }
}
