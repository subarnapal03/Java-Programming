package Arrays;

import java.util.Scanner;

public class TargetSum {
    static int pairSum(int [] arr,int target){
        int n = arr.length;
        int  ans =0;
        for (int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter The Element Of an array: ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter The target Sum: ");
        int target = sc.nextInt();
        System.out.println(pairSum(arr,target));
    }
}
