package Arrays;

import java.util.Scanner;

public class numberpresentByFrequencyarr {
    static int[] frequency(int[] arr){
        int [] freq = new int [1000];
        for(int i =0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
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
        int [] freq = frequency(arr);

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("Enter number to be searched: ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println(("YES"));
            }
            else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
