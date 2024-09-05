package String;

public class StringBuilder_reverse {
    public static void main(String[] args) {
        String str = "I Am Online Educator";
//        new string varibale "ans" is assing where the final output will be shown:-
        String ans = "";
//        StringBuilder variable is created where the reverse methood will be perform:-
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }
            else{ // if ch == ' '  online__<-
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
