package sorting;

public class move0end {

    static void moveZero(int [] arr, int n){

        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]==0 && arr[j]!=0){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,5,0,3,42};
        int n = arr.length;
        moveZero(arr,n);
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
