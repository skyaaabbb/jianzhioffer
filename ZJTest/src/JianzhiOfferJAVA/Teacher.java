package JianzhiOfferJAVA;

import java.util.List;

public class Teacher implements Cloneable{
    int id;
    String name;
    String address;
    List<String> courses;

    /**
     *  默认实现
     * */
    @Override
    public Object clone() throws CloneNotSupportedException {


        return  super.clone();
    }
}
