package Arrays;

import java.util.Scanner;

public class Second_Largest {

    static int SecondLargest(int [] arr){
       int ans =0;
       int Sl = arr[0];
       int l = arr[0];
       int n = arr.length;
       for(int i =1; i<n; i++){
           if(arr[i]>l){
               Sl=l;
               l = arr[i]; 
           }
           else if (arr[i]<l && arr[i]>Sl){
               Sl = arr[i];
           }
       }
       ans = Sl;
        return ans;
    }
    static void print(int []arr){
        for(int i =0; i<arr.length;i++ ){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of An array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the element of an array: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        System.out.println("Second largest Element in Array is: "+SecondLargest(arr));
    }

}
