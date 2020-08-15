package offertest;

/**
 * 问题描述：定义：数值序列中包含2~16进制整数，如果序列中有一个数，
 * 与序列中其他任何一个数大小都不相等，则这个数叫做“异数”。
 * 请找出给定数值序列中所有的“异数”.
 * 输入描述:
 * 输入数值序列i行(0<i)，每一行分别是进制和数值，
 * 以“#”分割。如：n#m, n是整数，代表n进制（1<n<17）,m是n进制下的数值.
 * 输入序列以结束符”END”结束。
 * m的字符集为0-9和A-F，保证数值在十进制下不超过1e9，
 * 行数不超过100001行。
 * 输出描述:
 * 输出j行(0<j<=i),每一行都是输入序列的“异数”。要求：
 * 1.按照输入序列的原序输出;
 * 2.如果没有”异数”,输出字符串”None”
 * 3.结束符“END”不用输出
 * 示例1
 * 输入
 * 10#15
 * 4#32
 * 4#33
 * 8#17
 * END
 * 输出
 * 4#32
 */
import java.util.*;

public class DiffNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,String> map = new HashMap<>();
        List set = new ArrayList<>();
        List list = new ArrayList<>();

//int[] nums={};

        int count = 0;

        while(sc.hasNext()){

            String s =sc.next();

            if("END".equals(s)){
                break;
            }
            String[] split = s.split("#");
            Integer num1 = Integer.valueOf(split[0]);//
            int temp = Integer.parseInt(split[1], num1);
            if(list.isEmpty()||!list.contains(temp)){
                list.add(temp);
                map.put(temp,s);
                set.add(temp);
            }else{
                if(set.contains(temp)){
                    set.remove((Object)temp);
                }
            }
        }
        if(set.size()==0){
            System.out.println("None");
        }else{
            Set keySet = map.keySet();
            for (Object key : keySet) {
                System.out.println(key.toString());
            }
            for (Object temp1 : set) {
                System.out.println(map.get(temp1));
            }
        }

    }
}
