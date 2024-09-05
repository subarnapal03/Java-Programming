package pratices;

public class isprime {
    public static int prime(int N){
        int cout =0;
        for(int i =0; i<=N; i++){
            if(N % i ==0){
                cout++;
            }

        }
        if(cout == 0){
            System.out.println(" YES PRIME...");
            return N;
        }
        else {
            System.out.println("NO");
        }
        return 0;
    }

    public static void main(String[] args) {

        int N = 5;
        System.out.println(prime(N));
    }
}
