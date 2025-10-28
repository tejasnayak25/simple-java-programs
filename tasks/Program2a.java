package tasks;

public class Program2a {
    public static void main(String[] args) {
        String[] people = {"Tejas", "Swasthik", "Karan", "Pavan", "Rajat"};
        System.out.println("--- Reversed 1D Names ---");
        for (int i = people.length - 1; i >= 0; i--) {
            System.out.println(people[i]);
        }
    }
}
