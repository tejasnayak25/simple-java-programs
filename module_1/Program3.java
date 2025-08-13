package module_1;

class Mother {
    int age = 40;
}

class Daughter extends Mother {
    String name = "Dinga";
}

public class Program3 {
    public static void main(String[] args) {
        Daughter d= new Daughter();
        Mother m = d;
        System.out.println("Up-casting"+" "+m.age);

        Daughter d2 = (Daughter) m;
        System.out.println("Down-casting");
        System.out.println(d2.age);
        System.out.println(d2.name);
    }
}
