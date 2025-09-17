package day3;

public class ASCII {
    public static void main(String[] args) {
        for(int i=32;i<=32;i++) {
            System.out.println(i+"->"+(char)i);
        }

        String x = "Mister 123";
        int c = 0, s = 0, sp = 0, d = 0;
        for(int i=0;i<x.length();i++) {
            char ch = x.charAt(i);
            if(ch >= 65 && ch <= 90)
                c++;
            else if(ch >= 97 && ch <= 122)
                s++;
            else if(ch == 32)
                sp++;
            else if(ch >= 48 && ch <= 57)
                d++;
        }

        System.out.println("Uppercase: "+c);
        System.out.println("Lowercase: "+s);
        System.out.println("Spaces: "+sp);
        System.out.println("Digits: "+d);
    }
}
