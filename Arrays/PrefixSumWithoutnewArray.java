package Arrays;

import java.util.Scanner;

public class PrefixSumWithoutnewArray {

    static int [] prefixSum(int [] arr){
    int n = arr.length;
    for(int i =1; i<n; i++){
        arr[i] = arr[i-1] + arr[i];
    }
        return arr;
    }

    static void Print(int []pref){
        for(int i=0; i<pref.length; i++){
            System.out.println(pref[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Element: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter " + n + " element");
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int [] pref = prefixSum(arr);
        Print(pref);
    }
}
