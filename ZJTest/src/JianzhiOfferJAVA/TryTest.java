package JianzhiOfferJAVA;

public class TryTest {
    public static void main(String[] args) {
    TryTest t = new TryTest();
        System.out.println(t.foo());
    }
    public int foo(){
        int x = 1;
        try{
            return x++;
        }finally{
            return x++;
        }
    }
}
