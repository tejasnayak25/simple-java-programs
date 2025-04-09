public class Method3 {
    //without arg and with return type
    static int disp() {
        return 10;
    }
    static double disp1() {
        return 13.99;
    }
    static char disp2() {
        return 'u';
    }
    static String disp3() {
        return "hello";
    }

    public static void main(String[] args) {
        int ans = disp();
        System.out.println(ans);
        System.out.println(disp1());
        System.out.println(disp2());
        System.out.println(disp3());
    }
}
