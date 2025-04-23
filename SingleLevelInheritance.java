class Base {
    static int i = 5;
    void property() {
        System.out.println("Parent's Properties");
    }
}

class Derived extends Base {

}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.property();
    }
}
