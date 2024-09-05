package Arrays;

public class MaxOfArray {
    static void Max(){
        int [] arr = {2,4,1,3,10,5,55};
        int max = arr[0];
        for (int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            else continue;
        }
        System.out.println("maximum of an array is: "+max);
    }

    public static void main(String[] args) {
        Max();
    }
}
