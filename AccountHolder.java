public class AccountHolder implements HDFCBank {
    @Override
    public void deposit() {
        System.out.println("Deposit");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw");
    }

    public static void main(String[] args) {
        AccountHolder a = new AccountHolder();
        a.deposit();
        a.withdraw();
    }
}
