package ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class Reverse {

    static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size()-1;

        while(i<j){
            /*
            int temp = a;
            a =b;
            b = temp;
             */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j , temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Original list: " +list);
//        reverseList(list);
//        calling inbuild function using collegetions
        Collections.reverse(list);
        System.out.println("Modified List: " +list);
    }
}
