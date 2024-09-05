package pratices;

public class duplicate {
    static int find(int []arr, int n){
        int ans =0;

        for(int i = 0; i < n; i++){
            for(int j = 1 ; j< n; j++){
                if(arr[i]==arr[j]){
                    i = -1;
                    j = -1;
                }
            }
        }

        for(int i = 0; i< n; i++){
            if(i == -1){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4 ,2, 3, 1, 4, 0};
        int n = 6;
        System.out.println(find(arr,n));
    }
}
