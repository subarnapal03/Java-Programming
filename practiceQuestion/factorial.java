package practiceQuestion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact =1,result,i;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for( i =1;i<=num;i++) {
            fact = fact * i;
        }
            System.out.println("Factorial of " + i + " is : "+ fact);
    }
}
