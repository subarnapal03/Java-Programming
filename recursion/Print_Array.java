package recursion;

public class Print_Array {

    static void PrintArray(int arr [], int idx){
        int n = arr.length;
        if(idx == n){
            return;
        }
        System.out.println(arr[idx]);
        PrintArray(arr,idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {5,6,4,8,9};
        int idx = 0;
//        System.out.println(PrintArray(arr,idx));
        PrintArray(arr,idx);
    }
}
