package Arrays;

import java.util.Scanner;

public class prefixSum {
    static int[] PrefixSumArray(int [] arr){
        int n = arr.length;
        int pref[] = new int[n];
        pref[0]= arr[0];
        for(int i =1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    static void Print(int []pref){
        for(int i=0; i<pref.length; i++){
            System.out.println(pref[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Element: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter " + n + " element");
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int [] pref = PrefixSumArray(arr);
        Print(pref);
//        System.out.println();
    }
}
