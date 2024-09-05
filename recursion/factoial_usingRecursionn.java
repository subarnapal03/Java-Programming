package recursion;

public class factoial_usingRecursionn {

   static int factorial(int n){
        int result;
//        base case
        if(n==1 || n==0) return 1;
//        smaller problem
        result = n * factorial(n-1);
        return result;
    }

//    static void factorial(int n){
//
//        if(n==1 || n ==0){
//            System.out.println(1);
//            return;
//        }
//        int ans = factorial(n-1);
//    }
    public static void main(String[] args) {
//        int n =5;
//        System.out.println( factorial(6));
    }
}
