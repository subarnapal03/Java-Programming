package recursion;

public class fibonaci_series {
    static int fibo(int n){

//        base case
        if(n ==0 || n ==1){
            return 1;
        }

//        subproblem
        int pev = fibo(n-1);
        int prev_prev = fibo(n-2);

        return pev+prev_prev;
    }

    public static void main(String[] args) {
//        printing fibonaci series
        int n =10;
        for (int i =0; i< n; i++){
            System.out.println(fibo(i));
        }
    }
}
