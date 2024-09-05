package recursion;

import java.util.Scanner;

public class finding_LCM {
    static int lcm(int x, int y){
        int ans =0;
        if( y == 0){
            int ans1 = x;
            int ans2 =x * y;
            return ans2 / ans1;
        }

        int fact = x * y;
        ans = fact / lcm(y,x%y);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(lcm(x,y));
    }
}
