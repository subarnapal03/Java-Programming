package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubsequenceRecursive {

    static ArrayList<String> getSQQ(String s){
        ArrayList<String> ans = new ArrayList<>();
//        base case
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> samllAns = getSQQ(s.substring(1));
//        smallAns = ["bc","b","c",""]
//        ans = ["bc", "abc", "b", "ab", "c", "ac", "", "a"]
        for(String ss: samllAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSQQ("abc");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
}
