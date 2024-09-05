package Arrays;

import java.util.Scanner;

public class AddbyQueries {

    static int [] QueriesSum(int [] arr){
        int n = arr.length;
//        int [] pref = new int[n];
//        pref[0] = arr[0];
        for(int i =1; i<n; i++){
            arr[i]= arr[i-1]+arr[i];
        }


        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Element: ");
        int n = sc.nextInt();
        int []arr = new int[n+1];

        System.out.println("Enter " + n + " element");
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int [] pref = QueriesSum(arr);
        System.out.println("Enter the number of queries: ");
        int q =sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter range:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l-1];

            System.out.println("Sum "+ans);
        }
    }
}
