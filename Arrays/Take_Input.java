package Arrays;

import java.util.Scanner;

public class Take_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase Enter the size of an array: ");
        int n = sc.nextInt();

        int arr [] = new int[n];
        System.out.println("Enter " + n + " Element");

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
