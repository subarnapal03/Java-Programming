package Arrays;

public class SumOfArray {

    static void Sum(){
        int [] arr = {5,9,11,16};
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of an array " +sum);
    }

    public static void main(String[] args) {
        Sum();
    }
}
