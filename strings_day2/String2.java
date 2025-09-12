package strings_day2;

public class String2 {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("h"));
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println();
        System.out.println(s.equals("hello"));
        System.out.println(s.equalsIgnoreCase("hello"));
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("o"));
        System.out.println(s.contains("ll"));
    }
}
