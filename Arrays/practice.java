package Arrays;

import java.util.Scanner;

public class practice {

//    static int unique(int [] arr){
//        int ans = 0;
//        int n = arr.length;
//         for(int i =0; i<n; i++){
//             for(int j =i+1; j<n; j++){
//                 if(arr[i]==arr[j]){
//                     arr[i]=-1;
//                     arr[j]=-1;
//                 }
//             }
//         }
//         for(int i =0; i<n; i++){
//             if(arr[i]!=-1){
//                 ans = arr[i];
//             }
//         }
//        return ans;
//    }

    static int firstapperence(int []arr){
        for(int i =0; i<arr.length;i++){
            for(int j =0; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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

//        System.out.println("The Unique Number is: "+unique(arr));
        System.out.println("Element is: "+firstapperence(arr));
    }
}
