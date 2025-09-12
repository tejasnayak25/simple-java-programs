package strings_day1;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java Programming is awesome");
        System.out.println(sb.replace(5, 15, "Python"));
        System.out.println(sb.reverse());
    }
}
