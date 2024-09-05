package Arrays;

public class ReverseWithoutNewArray {


    static void swapInplace(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    static void ReverseInPlace(int [] arr){
//        int n = arr.length;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swapInplace(arr,i,j);
            i++;
            j--;
        }
    }
    static void Print(int [] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        ReverseInPlace(arr);
        Print(arr);
    }
}
