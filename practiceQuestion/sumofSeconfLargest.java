package practiceQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class sumofSeconfLargest {

    static int LargerSmallerSum(ArrayList<Integer> arr){
        if(arr.size()<4){
            return 0;
        }
        ArrayList<Integer> oddPos = new ArrayList<>();
        ArrayList<Integer> evenpos = new ArrayList<>();

        for(int i =0; i<arr.size(); i++){
            if(i % 2 ==0){
                evenpos.add(arr.get(i));
            }
            else{
                oddPos.add(arr.get(i));
            }
        }
        Collections.sort(evenpos);
        Collections.sort(oddPos);
        int secondSmallest = arr.get(1);
        int Secondlarget = arr.get(arr.size()-2);

        return secondSmallest + Secondlarget;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(7);
        arr.add(5);
        arr.add(4);
        System.out.println(LargerSmallerSum(arr));
    }
}
