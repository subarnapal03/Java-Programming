package practiceQuestion;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int ans = 0;

        for(int i =0; i< n; i++){
            if(n%2 == 0){
                ans -=i;
            }
            else{
                ans +=i;
            }
        }
        System.out.println("sum of series is: "+ans);
    }
}
