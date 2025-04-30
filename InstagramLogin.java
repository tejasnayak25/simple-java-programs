public class InstagramLogin {
    void login(long mobileNumber, int otp) {
        System.out.println("Login using Mobile Number");
    }
    void login(String username, String password) {
        System.out.println("Login using Username");
    }
    public static void main(String[] args) {
        InstagramLogin insta = new InstagramLogin();
        insta.login(9876543210L, 1212);
        insta.login("user123", "pass123");
    }
}
