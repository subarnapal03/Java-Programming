package Arrays;

import java.util.Scanner;

public class RotationOfArray {

    static int[] rotate(int[] arr, int k){
        int n =  arr.length;
        k = k % n;
        int [] ans = new int[n];
        int j = 0;
        for (int i = n-k; i< n; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }
    static void print(int ans[]) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
        int [] arr = {1,2,3,4,5,6};
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();
        int [] ans = rotate(arr,k);
        print(ans);
    }
}
