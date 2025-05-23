import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("English");
                break;
            case 2:
                System.out.println("Telugu");
                break;
            case 3:
                System.out.println("Kannada");
                break;
            default:
                System.out.println("Enter the correct choice");
                break;
        }

        sc.close();
    }
}
