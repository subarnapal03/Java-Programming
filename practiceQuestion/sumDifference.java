package practiceQuestion;

public class sumDifference {

    static void differenceSum(int n,int m){
        int count =0;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%m == 0){
                count += i;
            }
            else {
                sum += i;
            }
        }
//        return sum - count;
        System.out.println(sum-count);
    }
    public static void main(String[] args) {
//        System.out.println(differenceSum(30,6));
        differenceSum(30,6);
    }
}
