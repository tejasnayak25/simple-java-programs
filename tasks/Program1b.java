package tasks;

public class Program1b {
    public static void main(String[] args) {
        String[][] nameGrid = {
            {"Tejas", "Swasthik"},
            {"Karan", "Pavan"},
            {"Rajat", "Vijay"}
        };
        System.out.println("--- 2D Name Grid ---");
        for (String[] row : nameGrid) {
            for (String name : row) {
                System.out.println(name);
            }
        }
    }
}
