package pratices;

import java.util.Scanner;

public class binary2decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binnary = sc.nextInt();
        int ans = 0;
        int pw = 1;

        while(binnary > 0){
            int unit = binnary % 10;
            ans = ans + (unit * pw);
            binnary = binnary / 10;
            pw = pw *2;
        }
        System.out.println(ans);
    }
}
