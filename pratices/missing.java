package pratices;

public class missing {
    public static int miss(int arr[],int n){
        int expected_sum = (n+1)*(n+2)/2;
        int actual_sum =0;



        for(int i = 0; i<n; i++){
            actual_sum = actual_sum + arr[i];
        }
        int result = expected_sum-actual_sum;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int []{1,2,3,4,5,6,8};
        int n = arr.length;
        System.out.println(miss(arr,n));
    }
}
