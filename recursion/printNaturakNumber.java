package recursion;

import java.util.Scanner;

public class printNaturakNumber {

    static void printDecresing(int n){

        //base case
        if(n == 1){
            System.out.println(1);
            return;
        }

        //self work
        System.out.println(n);

        //recursive work
        printDecresing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecresing(n);
    }
}
