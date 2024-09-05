package recursion;

import java.util.Scanner;

public class StringOccuranceRemove {

//    Ap-porch 2 Method without passing the parameter of string length or index position
    static String removeoccerence2(String s){
//        Base case
        if(s.length()==0){
            return "";
        }
//        recursive work
        String SmallAns = removeoccerence2(s.substring(1));
        char curr = s.charAt(0);
        if(curr != 'a'){
            return curr + SmallAns;
        }
        else {
            return SmallAns;
        }
    }
//    Apporach 1 passing the method using parameter index and string
    static String RemoveOccerence(String s , int idx){
//        base Case
        if(idx==s.length()){
            return "";
        }
//        Recursive work
        String SmallAns = RemoveOccerence(s,idx+1);
        char curr = s.charAt(idx);
        if(curr != 'a'){
            return curr + SmallAns;
        }
        else {
            return SmallAns;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(RemoveOccerence(s,0));
        System.out.println(removeoccerence2(s));

    }
}
