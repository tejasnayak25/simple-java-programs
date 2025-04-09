// import scanner from library
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        // create object
        Scanner scanner = new Scanner(System.in);
        
        // use in-built methods
        int age = scanner.nextInt();
        double cgpa = scanner.nextDouble();

        System.out.println(age);
        System.out.println(cgpa);
    }
}
