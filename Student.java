public class Student {
    int age = 20;
    String name = "Tejas";
    double cgpa = 8.9;

    void study() {
        System.out.println("Studying");
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    public static void main(String[] args) {
        System.out.println("Program Starts");
        Student s = new Student();
        System.out.println(s.age);
        s.study();
        System.out.println("Program Ends");
    }
}