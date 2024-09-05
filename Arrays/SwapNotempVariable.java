package Arrays;

import java.util.Scanner;

public class SwapNotempVariable {

static void swap(int a,int b){
    System.out.println("original value before swap: ");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
    a = a+b;
    b = a-b;
    a = a-b;
//    b = a+b;
    System.out.println("Value after swap: ");
    System.out.println("a: "+a);
    System.out.println("b: "+b);

}
    public static void main(String[] args) {
        System.out.println("Enter the value a and b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
}
