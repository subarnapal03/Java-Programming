package sorting;

public class insertionSort {
    static void insertion(int []arr, int n){

        for(int i =1; i<n; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] a = {8,3,6,5,4,2};
        insertion(a,6);
        for (int i =0; i<6; i++){
            System.out.print(a[i] + " ");
        }

    }
}
