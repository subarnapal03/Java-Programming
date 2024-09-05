package String;

public class DeleteString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Nayan Kumar Pramanik");
        str.delete(1,3);
        System.out.println(str);
    }
}
