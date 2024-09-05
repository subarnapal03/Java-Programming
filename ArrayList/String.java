package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class String {

    public static void main(String[] args) {
        ArrayList<java.lang.String> str = new ArrayList<>();
        str.add("Welcome");
        str.add("Nayan");
        str.add("Pramanik");
        System.out.println("Original: " +str);
        Collections.sort(str);
        System.out.println("only sort: " +str);
        Collections.sort(str,Collections.reverseOrder());
        System.out.println("Reverse order: "+str);
    }
}
