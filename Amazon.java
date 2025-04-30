public class Amazon {
    void payment() {
        System.out.println("COD");
    }
    void payment(String name) {
        System.out.println("UPI");
    }
    void payment(String username, String password) {
        System.out.println("Net Banking");
    }
    void payment(long mobileNumber, int otp) {
        System.out.println("Card Payment");
    }

    public static void main(String[] args) {
        Amazon a = new Amazon();
        a.payment();
        a.payment("Gpay");
        a.payment("ICICI", "Pa$$w0rD");
        a.payment(9876543210L, 7474);
    }
}
