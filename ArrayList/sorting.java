package ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class sorting {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(40);
        list.add(5);
        list.add(30);
        System.out.println("Originnal List: " +list);
        Collections.sort(list);
        System.out.println("Sorted Array: " +list); //arrange the kist in an assending order
//        so to make it in desending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending order: " +list);

    }
}
