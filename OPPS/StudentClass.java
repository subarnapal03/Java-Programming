package OPPS;

public class StudentClass {

    public static class student{
        String name;
        int rno;
        double percentage;
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Nayan";
        s1.rno = 12;
        s1.percentage = 78.831;
        System.out.println(s1.name);
    }
}
