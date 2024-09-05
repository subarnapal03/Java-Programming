package recursion;

public class SumElementArray {

    static int SumOfArray(int [] arr, int idx){
//        Base case
        if(idx == arr.length - 1){
            return arr[idx];
        }

//        Self Work And Recursive Work
        return arr[idx] + SumOfArray(arr,idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,20,1};
        int idx = 0;
        System.out.println(SumOfArray(arr,idx));
    }
}
