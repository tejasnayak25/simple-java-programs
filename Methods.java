public class Methods {
    static void greetings() {
        System.out.println("Hello World!");
    }

    static void mul(int i, int j, int k) {
        System.out.println(i*j*k);
    }

    static String name() {
        return "Uma";
    }

    static boolean flag(int i) {
        if(i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        greetings();
        mul(2, 3, 4);
        System.out.println(name());
        System.out.println(flag(3));
    }
}
