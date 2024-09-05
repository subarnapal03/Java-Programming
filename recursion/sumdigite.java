package recursion;

public class sumdigite  {

    static int sumOfDigit(int n){
        if(n>=0 && n <=9){
            return n;
        }

//        int unit_digit = n % 10;
//        int first_digit = n / 10;
        int result = sumOfDigit(n/10);

        return result + sumOfDigit(n%10);
    }

    public static void main(String[] args) {
//        System.out.println(sumOfDigit(1234));
        System.out.println(sumOfDigit(1234));

//        for(int i = 0; i<=123; i++){
//
//        System.out.println(sumOfDigit(i));
//        }
    }
}
