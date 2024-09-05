package recursion;

import java.util.Scanner;

public class palindromUsingrecursion2 {

    static boolean palindrom(String s, int i, int j){
   if(i>=j){
       return true;
   }
return (s.charAt(i) == s.charAt(j) && palindrom(s,i+1,j-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindrom(s,0,s.length()-1));
    }
}