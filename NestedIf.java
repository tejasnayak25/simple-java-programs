public class NestedIf {
    public static void main(String[] args) {
        double accBal = 134567.987;
        double withDraw = 12000.00;

        if(accBal > withDraw) {
            if (withDraw%100 == 0) {
                System.out.println("Withdraw Successful");
            } else {
                System.out.println("Invalid Denomination");
            }
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
