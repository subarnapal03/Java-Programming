package recursion;

public class ReverseString {
    static String reverse(String s, int idx){

        if(idx==s.length()){
            return "";
        }
        String SmallAns = reverse(s,idx+1);
        return SmallAns + s.charAt(idx);
    }

    public static void main(String[] args) {
        String s = "abcde";
        int idx = 0;
        System.out.println(s);
        System.out.println(reverse(s,idx));
    }
}
