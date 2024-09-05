package pratices;

public class pairSum {

    static void Pair(int [] arr,int n){
        int i,j;
        int [] sum = new int [n];
        int psum = 5;
        for(i = 0; i<n; i++){
            for(j = i+1; j<n; j++){
                if(arr[i] + arr[j]==psum){
//                     sum [] = {arr[i],arr[j]};
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int n = arr.length;
        Pair(arr,n);
    }
}
