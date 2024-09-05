package practiceQuestion;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        int ans =0;
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int original = Num;

//        using while loop
//        while(Num != 0){
//             ans = (ans*10 + Num%10);
//             Num = Num/10;
//        }

//        using for loop
        for(int i = Num; Num!=0; Num = Num / 10){
            ans = (ans *10 + Num %10);
        }
        System.out.println("The reverse is "+ans);
    }
}
