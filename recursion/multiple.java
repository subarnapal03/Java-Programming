package recursion;

import java.util.Scanner;

public class multiple {


    static void printMultiple(int n , int k){
//        base case
        if(k == 1){
            System.out.println(n);
            return;
        }
//        recursive work
        printMultiple(n,k-1);  // 5 10 15
        System.out.println(n*k);  // 20
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        System.out.println();
        // 5 10 15 20
        printMultiple(n,k);
    }
}
