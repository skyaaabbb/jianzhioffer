import java.util.Scanner;

public class CountTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(countTime(number));

    }
//计算次数
    private static int countTime(int number) {
        int count = 0;
        if(number <= 0)
            return -1;
        if(number == 1)
            return 0;
        if(number % 2 == 0){
            count = 1 + countTime(number / 2);
        }else{
            count = 1 + countTime(number + 1);
        }
      return count;
    }
}
