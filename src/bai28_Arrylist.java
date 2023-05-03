import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai28_Arrylist {
    public static void main(String[] args) {
//        Khoi tao
        ArrayList<Integer> lst = new ArrayList<>();
//        Khai bao voi so luong phan tu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
//        Khai bao so phan tu san co
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(5,7,1,2,3,4));

        for (int i : lst3) {
            System.out.println(i);
        }

        for (int i=0; i<lst3.size(); i++) {
            System.out.println(lst3.get(i));
        }
        lst3.add(4, 12);
        Collections.sort(lst3);
        System.out.println(lst3);
        System.out.println(lst3.indexOf(3));
    }
}
