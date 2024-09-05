package recursion;

public class power {
  /*  static int pow(int p, int q){
//  base case
        if(q == 0){
            return 1;
        }
//        resursion work
        return pow(p,q-1) * p;
    }
    */

//    another apporach to find the solutiion of power findind
   static int pow2(int p, int q){
//       base Case
       if( q == 0){
           return 1;
       }
//       for even
       if(q % 2 ==0){
           int sam_problem = pow2(p,q/2);
           return sam_problem * sam_problem;
       }
//       if any odd power come
       int sam_problem = pow2(p,q/2);
       return p * sam_problem * sam_problem;
   }

    public static void main(String[] args) {
//        System.out.println(pow(5,3));
        System.out.println(pow2(5,4));
    }
}
