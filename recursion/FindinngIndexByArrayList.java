package recursion;

import java.util.ArrayList;

public class FindinngIndexByArrayList {

    static ArrayList<Integer> FindIndex(int[] a, int n, int idx, int target){
//        Creating New ArrayList if no element found then empty arrayList will be return
//        a[] --> {1,2,3,2,4,2}
//        target --> 2
//        ans --> [1,3,5]
        ArrayList<Integer> ans = new ArrayList<>();

//        Base case
        if(idx >= n){
            return ans;
        }
//      Self work
        if(a[idx] == target ){
            ans.add(idx);
        }

        ArrayList<Integer> SmallAns = new ArrayList<>();
        SmallAns = FindIndex(a,n,idx+1,target);
        ans.addAll(SmallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,4,2,6,2};
        int n = a.length;
        int target = 2;
        int idx = 0;
        System.out.println(FindIndex(a,n,idx + 1, target));
    }
}
