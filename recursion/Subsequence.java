package recursion;
//this is nit the correct code the expected output is not same as the desie output

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    static ArrayList<String> subset(String s){
//        int i =0;
//        int j = s.length();S
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0; i<s.length(); i++){
            for(int j = i+1; j<s.length();j++){
               ans.add(s.substring(i,j));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(subset(s));
    }
}
