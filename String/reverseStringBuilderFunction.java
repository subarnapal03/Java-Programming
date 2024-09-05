package String;

public class reverseStringBuilderFunction {
    static String Reverse(String s){
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans +=" ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        return ans;
    }

    public static void main(String[] args) {
        String s = "Nayan Kumar Pramanik";
        System.out.println(Reverse(s));
    }
}
