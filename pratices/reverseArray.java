package pratices;

import java.util.Scanner;

public class reverseArray {
   public static int[] reverse(int [] arr, int n){
       int arr2[] = new int[n];
       int j=0;
       for(int i = n-1; i>=0; i--){
            arr2[j++] = arr[i];
       }
       for(int i =0; i<n; i++){
           System.out.println(arr2[i]);
       }
       return arr2;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(reverse(arr,n));
        reverse(arr,n);
    }
}
