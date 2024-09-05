package String;

import java.util.Scanner;
// Question -> if a given question is in upper and lower case thne toggle the value
//input -> PhySiCs
//output -> pHYsIcS
public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
//        Toggle Case
//         PyHiCs --> pYhIcS
        for (int i = 0; i<str.length();i++){
//            P --> p
//        Check -> alphabet is Small or capital
            boolean flag = true; // true -> Capital letter is found
            char ch = str.charAt(i);
            if(ch == ' ') continue; //IF FOUND ANY SPACE BETWEEN STRING THEN LEAVE THEM AND CONINUE
            int asci = (int)ch; //TypeCasting to get the asci value of letter
            if(asci>=97) flag = false; //if any small alphhabet is found
            if(flag == true){ // for captital letter
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
            else {  //for small letter
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
