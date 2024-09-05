package NumberSystem;

import java.util.Scanner;

public class Binary_DecimalConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Binary =sc.nextInt();
        int ans = 0; //converting decimal number
        int pw = 1; //2  0 = 1 power of 2

        while(Binary > 0){
            int unit_digites = Binary % 10;
            ans += (unit_digites *pw);
            Binary /= 10;
            pw *= 2;
        }
        System.out.println(ans );
    }
}
