package strings_day2;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        System.out.println(s);
        s.append("123");
        System.out.println(s);
        s.replace(0, 2, "zz");
        System.out.println(s);
    }
}
