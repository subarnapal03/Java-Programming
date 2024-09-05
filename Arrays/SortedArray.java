package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SortedArray {
    static void isSorted(int []arr){
        for(int i =1; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                System.out.println("The given array is not sorted...");
            }
                System.out.println("The Given Array is sorted...");
        }
    }
    static void print(int [] arr){
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of an array...");
        int n = sc.nextInt();

        System.out.println("Enter " +n+ " Element-" );
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        isSorted(arr);
    }
}
