package practiceQuestion;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Count = 0;
        int Original_n = n;
        while(n > 0){
            n = n/10;
            Count++;
        }
        System.out.println("The Number is "+Original_n+ "=" +Count);
    }
}
