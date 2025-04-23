public class Pen {
    int price;

    Pen() {
        price = 10;
        System.out.println(price);
    }

    public static void main(String[] args) {
        System.out.println("Program Starts");
        Pen p = new Pen();
        System.out.println("Program Ends");
    }
}
