import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 请设计一种数据结构（对用户而言，用于维护所有数据按从小到大的排列），支持用户对数据顺序的维护及查询需求：
 *
 * 操作1：插入一个数 X
 * 操作2：删除序列中的数X，如存在多个仅删除其中一个
 * 操作3：查询X在的排序后的序号，如存在多个仅输出第一个
 * 操作4：查询排名为X的数
 * 操作5：查询所有小于X的数中最大的数
 * 操作6：查询所有大于X的数中最小的数
 *
 * 注：数据结构初始为空。
 * 输入描述:
 * 第一行为 n，表示操作的个数，下面 n行每行有两个数 opt 和 x， opt 表示操作的序号（1<=opt<=6）,与题目中一一对应。
 * 输出描述:
 * 对于操作 3、4、5、6 每行输出一个数，表示对应答案。
 * 输入例子1:
 * 10
 * 1 106465
 * 4 1
 * 1 317721
 * 1 460929
 * 1 644985
 * 1 84185
 * 1 89851
 * 6 81968
 * 1 492737
 * 5 493598
 * 输出例子1:
 * 106465
 * 84185
 * 492737
 */
public class ArrayListTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Map<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        //操作指令及数字
        for (int i = 0; i < n; i++) {
         nums[i][0] = sc.nextInt();
         nums[i][1] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        doNumbers(nums,list);
    }
//遍历执行操作集
    private static void doNumbers(int[][] nums,ArrayList<Integer> list) {
        for (int i = 0; i < nums.length; i++) {
           if(nums[i][0] == 1)
               list.add(nums[i][1]);
           if(nums[i][0] == 2)
               list.remove(nums[i][1]);
           if(nums[i][0] == 3)
               System.out.println(list.indexOf(nums[i][1]));
           if(nums[i][0] == 4)
               System.out.println(list.get(nums[i][1]));
           if(nums[i][0] == 5){
                int index = list.indexOf(nums[i][1]);
                for (int j = 0; j < index; j++) {
                    System.out.println(list.get(j));
                }
           }
           if(nums[i][0] == 6){
               int index = list.indexOf(nums[i][1]);
               for (int j = index + 1; j < list.size(); j++) {
                   System.out.println(list.get(j));
               }
           }
        }
    }
}
