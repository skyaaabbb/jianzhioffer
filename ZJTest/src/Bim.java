
import java.util.Scanner;

public class Bim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        if(count < 3) return;
        for (int i = 0; i < count; i++) {
            if(i == 0 || i == count - 1){
                for(int j = 0; j < count ; j++)
                    System.out.print("* ");
                System.out.println();
            }else{
                for(int j = 0; j < count ; j++){
                    if(j == 0 || j == count - 1)
                        System.out.print("* ");
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}