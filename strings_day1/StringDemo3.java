package strings_day1;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = new String("Hello");
        if(s == s1) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        if(s.equals(s1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
