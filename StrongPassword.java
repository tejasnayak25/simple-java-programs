import java.util.Scanner;

public class StrongPassword {
    static boolean specialChar(String pass) {
        if(pass.contains("@") || pass.contains("#") || pass.contains("$") || pass.contains("^"))return true;
        return false;
    }
    public static void main(String[] args) {
        boolean strong = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        if(password.length() < 7) strong = false;
        if(!(specialChar(password))) strong = false;
        if(strong) {
            System.out.println("Your password is strong!");
        } else {
            System.out.println("Your password is weak!");
        }
    }
}
