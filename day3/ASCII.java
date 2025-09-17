package day3;

public class ASCII {
    public static void main(String[] args) {
        for(int i=32;i<=32;i++) {
            System.out.println(i+"->"+(char)i);
        }

        String x = "Mister X";
        for(int i=0;i<x.length();i++) {
            System.out.println(x.charAt(i));
        }
    }
}
