package sorting;

public class QuickSort {
    static void display(int [] arr){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quick(int []arr, int st, int end){
        if(st>=end) return;
        int pi = Partition(arr,st,end);
        quick(arr,st, pi -1);
        quick(arr,pi+1,end);
    }
    static int Partition(int arr[], int st,int end){
//        initalizing the pivot variable
        int pivot = arr[st];
//        if any value found less then pivot then count will be incress
        int count = 0;
        for(int i =0; i<end;i++) {
            if (arr[i] <pivot) count ++;
        }
//        now find the exact position of pivot element
        int pivotIndex = st + count;
        swap(arr,st,pivotIndex);
        int i = st, j = end;

        while(i<pivotIndex && j> pivotIndex){
            while (arr[i] <= pivotIndex) i++;
            while(arr[j]> pivotIndex) j--;

            if(i<pivotIndex && j> pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
return pivotIndex;
    }

    public static void main(String[] args) {
        int [] arr = {7,13,8,5,10,2,4};
        int n = arr.length;
        System.out.println("Before Sorting....");
        display(arr);
        quick(arr,0,n-1);
        System.out.println("after Sorting....");
        display(arr);
    }
}
