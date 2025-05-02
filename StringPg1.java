public class StringPg1 {
    public static void main(String[] args) {
        String s = "Java Developer";
        System.out.println(s.charAt(3));
        System.out.println(s.length());

        char[] arr = s.toCharArray();

        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.contains("dev"));
        System.out.println(s.startsWith("java"));
        System.out.println(s.endsWith("per"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();

        String s2 = "java developer";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
    
        String m = " junior tester ";
        System.out.println(m.trim());
        System.out.println(m.substring(2));
        System.out.println(m.substring(1, 7));

        String cars = "kia, bmw, benz";
        String[] splits = cars.split(",");
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }
    }
}
