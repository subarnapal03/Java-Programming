package sorting;

public class selectionSort {
static void selection(int [] arr,int n) {
    for (int i = 0; i < n; i++) {
        int min_index = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
}
    public static void main (String[]args){
        int[] arr2 = {7, 4, 5, 1, 2};
        selection(arr2, 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

