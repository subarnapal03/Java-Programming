package recursion;

public class palindronUsingRecursion {

    static boolean Palindrom(String s){
//        if(s.length()==0){
//            return t
//        }
        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "eabcbae";
        if(Palindrom(s)==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
