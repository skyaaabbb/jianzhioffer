package offertest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum {
    //测试方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length ; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(MoreThanHalfNum_Solution(array));
        System.out.println(MoreThanHalfNum_Solution1(array));
    }
    //实现方法一
    //用map记录每个数对应出现的次数
    public static int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < array.length; i++){
            //int count = 1;
            if(map.size() <= 0 || !map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                int count = map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        //遍历map中数字，找到出现次数超过一半的数
        for(int i = 0; i < array.length; i++){
            if(map.get(array[i]) > array.length/2){
                return array[i];
            }
        }
        return 0;
    }
    //方法二 多数投票法
    /**
     * 使用 cnt 来统计一个元素出现的次数，
     * 当遍历到的元素和统计元素相等时，令 cnt++，否则令 cnt--。
     * 如果前面查找了 i 个元素，且 cnt == 0，说明前 i 个元素没有 majority，
     * 或者有 majority，但是出现的次数少于 i / 2 ，因为如果多于 i / 2 的话
     * cnt 就一定不会为 0 。此时剩下的 n - i 个元素中，majority 的
     * 数目依然多于 (n - i) / 2，因此继续查找就能找出 majority。
     */
    public static int MoreThanHalfNum_Solution1(int[] array){
        int majority = array[0];
        //遍历数组查找出现次数超过一半的数字
        for (int i = 0,cnt = 1; i < array.length ; i++) {
            cnt = array[i] == majority ? cnt + 1 : cnt - 1;
            if (cnt == 0){
                majority = array[i];
                cnt = 1;
            }
        }
        int cnt = 0;
        //统计majority出现的次数
        for (int val: array ) {
            if(val == majority)
                cnt++;
        }
        return cnt > array.length/2 ? majority : 0;
    }
}
