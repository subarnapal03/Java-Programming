package recursion;

public class MaxValurArray {

    static int MaxArray(int [] arr, int idx){
//        base case
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = MaxArray(arr,idx + 1);

        return Math.max(arr[idx],smallAns);
    }

    public static void main(String[] args) {
        int arr[]= {15,13,3,10,9,12,2};
        int idx = 0;
        System.out.println(MaxArray(arr,idx));
    }
}
