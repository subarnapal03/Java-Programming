package Arrays;

public class ChangingValue {
    static void PrintArray(int [] arr){
        int a = 1004;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void ChangingArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int a = 5;
        int array [] = new int[5];
        array[0]=2;
        array[1]=20;
        array[2]=22;
        array[3]=32;
        array[4]=12;

        System.out.println("Original Array ");
        PrintArray(array);
        ChangingArray(array);
        System.out.println("After Changing Array");
        PrintArray(array);
        System.out.println(a);
    }
}
