class Person {
    void human() {
        System.out.println("Human");
    }
}

class Study extends Person {
    void disp() {
        System.out.println("He is studying");
    }
}

class Play extends Person {
    void show() {
        System.out.println("He is playing");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Study s = new Study();
        s.human();
        s.disp();
        Play p = new Play();
        p.human();
        p.show();
    }
}
