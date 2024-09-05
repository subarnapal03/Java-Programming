package pratices;

public class palandrom {
    public static void main(String[] args) {
        String str = "abcba";
//        for(int i = 0; i< str.length(); i++){
//            for(int j = str.length() -1; j>0; j--){
//                if(str.charAt(i)==st'r.charAt(j)){
////                    System.out.println("Yes");
//
//                }
//                else{
////                    System.out.println("No");
//                }
//            }
//        }
//        int i = str.indexOf(0);
//        int j = str.length() - 1;
//        boolean flag = false;
//        while(i<j){
//            if(str.charAt(i)==str.charAt(j)){
//                flag = true;
//            }
//            else {
//                flag = false;
//            }
//
//            i++;
//            j--;
//        }
//        if(flag == true){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr + "";
        if(str.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
