package OOPs;

import java.util.Scanner;

class Algebra{
    int Sum(int a , int b){
        int ans = a + b;
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("The Sum of number is:");
        int ans = obj.Sum(x,y);
        System.out.println(ans);
    }
}
