package Arrays;

import java.util.Scanner;

public class FindDuplicate {

    static int DuplicateNumber(int [] arr){
//        int ans = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
//                    ans = arr[i];
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static void print(int [] arr){
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array: ");
        int n = sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter The Element of an array: ");
        for (int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        print(arr);
        System.out.println("Duplicate Element is: "+DuplicateNumber(arr));

    }
}
