package pratices;

import java.util.ArrayList;

public class pp {
    static ArrayList<Integer> prime( ArrayList<Integer>arr2, int n) {


//        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <n; i++){
            boolean isprime = true;
            for(int j = 2; j<n; j++){
                if(i%j ==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                arr2.add(i);
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        System.out.println(prime(arr,10));
    }
}
