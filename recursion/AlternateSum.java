package recursion;

import java.util.Scanner;

public class AlternateSum {

    static int Alternate(int n){
        if(n == 0) return 0;

        if(n % 2 == 0){
            return Alternate(n - 1) - n;
        }
        else {
            return Alternate(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Result is :" +Alternate(n));
    }
}
