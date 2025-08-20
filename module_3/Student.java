package module_3;

public class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 =new Student(20, "ram");
        Student s2 = new Student(18, "sita");

        Student[] s = new Student[2];
        s[0] = s1;
        s[1] = s2;

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].age+" "+s[i].name);
        }
    }
}
