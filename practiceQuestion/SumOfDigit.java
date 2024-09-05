package practiceQuestion;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SumOfDigits =0;
        int n = sc.nextInt();
        int original_n = n;

        while(n>0){
            SumOfDigits += n % 10;
            n = n/10;
        }
        System.out.println("The Number is "+original_n+ "=" +SumOfDigits);
//        int num=0;
//        int sum =0;
//        int i;
//        while(num !=7){
//            i = sc.nextInt();
//            sum += i;
//            num++;
//        }
//        System.out.println("The Sum is "+sum);



    }
}
