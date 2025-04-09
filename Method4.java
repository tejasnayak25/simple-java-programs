public class Method4 {
    //with arg and with return type
    static int sq(int a) {
        System.out.println("Sq of the given number");
        return a*a;
    }
    static int cb(int a) {
        return a*a*a;
    }
    public static void main(String[] args) {
        int ans = sq(2);
        System.out.println(ans);
        System.out.println(cb(3));
    }
}
