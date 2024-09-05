package recursion;

import java.util.Scanner;

public class printNaturalNumber {

    static  void printIncrease(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncrease(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncrease(n);
    }
}
