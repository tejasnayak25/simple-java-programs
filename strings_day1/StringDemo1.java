package strings_day1;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "Python";
        String s1 = "python";
        if(s.equals(s1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if(s.equalsIgnoreCase(s1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
