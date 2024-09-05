package recursion;

import java.util.Scanner;

public class finndingGCD {

//    without using recursion
    /*
    static int GCD(int x, int y){
        while(x % y != 0){
            int raminder = x % y;
            x = y;
            y = raminder;
        }
        return y;
    }

     */
//  using recursion ( euclids algorithms)
    static int gcd(int x, int y){
        if( y == 0) return x;

        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
//        System.out.println(GCD(x,y));
        System.out.println(gcd(x,y));
    }
}
