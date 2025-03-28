public class MultipleMethod {
    static void disp() {
        System.out.println("Executing Disp().....");
    }
    static void run() {
        disp();
        System.out.println("Executing Run().....");
    }
    public static void main(String[] args) {
        System.out.println("Program Starts");
        run();
        System.out.println("Program Ends");
    }
}
