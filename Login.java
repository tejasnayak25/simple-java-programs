import java.util.Scanner;

public class Login {
    String username = "";
    String password = "";
    String pass2 = "abcde";
    Scanner sc = new Scanner(System.in);

    void getUser() {
        System.out.print("Enter username: ");
        username = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();
    }

    int captcha() {
        System.out.println("Enter captcha: (12bc8)");
        String cp = sc.nextLine();
        if(cp.equals("12bc8")) {
            return 1;
        }
        return 0;
    }

    void loginUser() {
        if(password.equals(pass2)) {
            System.out.println("Login successful!");
            System.out.println("Welcome, "+username);
        } else {
            System.out.println("Wrong Password!");
        }
    }

    public static void main(String[] args) {
        Login lg = new Login();
        System.out.println("Welcome to login");
        lg.getUser();
        int cp = lg.captcha();
        if(cp == 1) {
            lg.loginUser();
        } else {
            System.out.println("Captcha Failed!");
        }

        lg.sc.close();
    }
}
