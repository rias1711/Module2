package Week1.Day5;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "HUST";

    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "Codegym";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(1, "Hiep");
        StaticMethod s2 = new StaticMethod(2, "Hai");
        StaticMethod s3 = new StaticMethod(3, "Hoang");

        s1.display();
        s2.display();
        s3.display();
    }
}
