package recursion;

public class LinerSearchUsinngRecursion {

//    Here return TRUE OR FALSE if element present innt the array or not !!!!!
   /* static boolean Search(int arr[],int n, int idx, int target){
//        Base Case
        if(idx >= n){
            return false;
        }
//        Self work
        if(arr[idx] == target){
            return true;
        }
//        recursive work
        return Search(arr,n,idx + 1,target);
    }
    */


    //    finding that whether the element is present in the array ,if YES then return index if NO return -1;
 /*   static int LinearSearch(int[] arr, int n, int idx, int target){
        if(idx >= n){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return LinearSearch(arr,n,idx + 1, target);
    }*/

// finding all the indexs where the element is present in the array
static void PrintIndices(int [] a, int n, int idx, int target){
    if(idx >= n){
        return;
    }
    if(a[idx] == target){
        System.out.println(idx);
    }
    PrintIndices(a,n,idx+1,target);
}
    public static void main(String[] args) {
        int[] arr = {4,12,54,14,3,8,6,1};
        int [] a = {2,4,3,2,2,1,6,2};
        int idx = 0;
//        int target = 1;
        int target = 2;
        int n= arr.length;

//       Printing the index of an array if element is present int that array!!!!
//        System.out.println(LinearSearch(arr,n,idx,target));


//        Printing the Booloean value if element is present....@@@
//        if(Search(arr,n,idx,target)){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }

//        printing all the indexs where element is present....!!!
        PrintIndices(a,n,idx,target);
    }
}
