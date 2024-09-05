package Arrays;

import java.util.Scanner;

public class Swaping {
static void swap(int a, int b){
    System.out.println("original value before swap: ");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
    System.out.println("Value after swap: ");
    int temp = a;
    a = b;
    b =temp;
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
