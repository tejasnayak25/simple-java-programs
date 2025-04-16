import java.util.Scanner;

public class Login {
    String username = "";
    String password = "";
    String pass2 = "abcde";

    void getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        scanner.close();
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
        lg.loginUser();
    }
}
