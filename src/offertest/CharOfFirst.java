package offertest;

import java.util.ArrayList;
import java.util.List;

public class CharOfFirst {
        //Insert one char from stringstream
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        public void Insert(char ch)
        {
            if(list1.size()  <= 0 && list2.size() <= 0){
               list1.add(ch);
               list2.add(ch);
            }else if(list1.size() > 0 && list2.size() > 0){
                if(list1.contains(ch)){
                    if(list2.contains(ch)){
                        list2.remove(ch);
                    }
                }else{
                    list1.add(ch);
                    list2.add(ch);
                }
            }
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce()
        {
            return list2.get(0);
        }
}
