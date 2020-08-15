import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 乐鑫提前批笔试第一题：
 * 要求：输入n（0 < n <= 36）进制,除数m(0 < m <= 36),m是十进制数，输入n进制的被除数，
 * 允许输入范围0-9、a-z。
 * 输入超出进制表示范围或空格表示输入结束
 * 例：输入 n = 11，m = 10，
 * 被除数： 123abc  （实际有效数据：123a）
 * 输出余数： 6
 */
public class Test {
    public static void main(String[] args) {
        //输入进制数和除数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//进制数
        int m = sc.nextInt();//除数
        List<String> list = new ArrayList<String>();
        list.add(sc.nextLine());//输入被除数
        String ch = list.toString();
        System.out.println(ch);
        char[] ch1 = ch.toCharArray();
        List<Character> characterList = new ArrayList<Character>();
        System.out.println("ch1.length:" + ch1.length);
        //获取有效的字段
        for(int i = 2; i < ch1.length - 1;){
            if(n > 10){
                //进制大于10进制时，0-9转换为对应数字，a-z转换为应表示的数字
                if((ch1[i] >= '0' && ch1[i] <= '9')||(ch1[i] >= 'a' && ch1[i] <= 'a'+(n - 11))){
                    characterList.add(ch1[i]);
                    i++;
                }else{
                    break;
                }
            }
            //进制小于等于10进制的处理
            if(n <= 10){
                if((ch1[i] >= '0' && ch1[i] <= (n - 1) + '0')){
                    characterList.add(ch1[i]);
                    i++;
                }else{
                    break;
                }
            }
        }
        System.out.println(characterList);
        //转换为十进制
        int result = 0;
        for(int j = characterList.size() - 1;j >= 0; j--){
            if(characterList.get(j) >= '0' && characterList.get(j) <= '9'){
                result += (int)(characterList.get(j) - '0') * Math.pow(n,characterList.size() - 1 - j);
            }else if(characterList.get(j) >= 'a' && characterList.get(j) <= 'a'+(n - 1)){
                result += (int)(characterList.get(j) - 87) * Math.pow(n,characterList.size() - 1 - j);
            }
        }
        System.out.println("result:" + result);
        System.out.println(result % m);


    }
}
