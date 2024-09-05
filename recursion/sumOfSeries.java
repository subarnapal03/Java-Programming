package recursion;

public class sumOfSeries {

    static int SumSeries(int n){
        if(n == 0 || n ==1){
            return n;
        }
        int ans = SumSeries(n-1) + n;
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(SumSeries(n));
    }
}
