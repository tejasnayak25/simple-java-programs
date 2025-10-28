package tasks;

public class Program2b {
    public static void main(String[] args) {
        String[][] groups = {
            {"Tejas", "Swasthik"},
            {"Karan", "Pavan"},
            {"Rajat", "Vijay"}
        };
        System.out.println("--- Reversed 2D Names ---");
        for (int i = groups.length - 1; i >= 0; i--) {
            for (int j = groups[i].length - 1; j >= 0; j--) {
                System.out.println(groups[i][j]);
            }
        }
    }
}
