package String;
import java.util.*;
public class PalindromicString {
    public static void main(String[] args) {
        String str = "abcdedcba";
//        sata tarika
        /*
        System.out.println(str);
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        System.out.println(gtr);
        String s = gtr + "";
        if (str.equals(s)) {
            System.out.println("Palindrome");
        } else{
            System.out.println("Not palindrome");
        }
         */

//        Approach 2 to find palindrom or not
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag == true) System.out.println("Palindrome..");
        else System.out.println("Not Palindrome..");
    }
}
