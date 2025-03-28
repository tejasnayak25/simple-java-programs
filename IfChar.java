public class IfChar {
    public static void main(String[] args) {
        char ch = '1';

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Case");
        } else if(ch >= '0' && ch <= '9') {
            System.out.println("Digits");
        } else {
            System.out.println("Special Symbols");
        }
    }
}
