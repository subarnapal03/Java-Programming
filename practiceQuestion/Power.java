package practiceQuestion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int ans =1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        for(int i =1 ; i< b; i++){
            ans *= a;
        }
        System.out.println(ans);
    }

}
