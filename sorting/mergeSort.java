package sorting;

public class mergeSort {

    static  void display(int [] arr){
        for (int value: arr) {
            System.out.println(value);
        }
    }
    static void merge(int [] arr, int l, int r){
    
    }

    public static void main(String[] args) {
        int [] arr = {4,1,3,5,2};
        int n = arr.length;
        System.out.println("Array before Sorting");
        display(arr);
        merge(arr,0,n);
        System.out.println("Array After Sorting");
        display(arr);
    }
}
