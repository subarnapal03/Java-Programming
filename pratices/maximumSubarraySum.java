package pratices;

public class maximumSubarraySum {
    public static int maxSubArray(int [] arr, int n){
        int maxi = 0;
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            sum += arr[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{-2,3,1,-4,2,2,-6};

        System.out.println(maxSubArray(arr,7));
    }
}
