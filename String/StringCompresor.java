package String;

public class StringCompresor {
    static String CountPrint(String s){
        String ans = " "+s.charAt(0);
        int count = 1;
        for(int i=1; i<s.length(); i++){
//            indecate the current character in the String..
            char curr = s.charAt(i);
//            indecate the preveious value in the String
            char prev = s.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1) ans += count;
                ans += curr;
                count = 1;
            }
        }
        if(count >1) ans += count;
        return ans;
    }
    public static void main(String[] args) {
        String s = "aaabbbccddeeeefff";
        System.out.println(CountPrint(s));

    }
}
