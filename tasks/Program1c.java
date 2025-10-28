package tasks;

public class Program1c {
    public static void main(String[] args) {
        String[][][] nameCube = {
            {
                {"Tejas", "Swasthik"},
                {"Karan", "Pavan"}
            },
            {
                {"Rajat", "Deepak"},
                {"Anupama", "Vijay"}
            }
        };
        System.out.println("--- 3D Name Cube ---");
        for (String[][] matrix : nameCube) {
            for (String[] row : matrix) {
                for (String name : row) {
                    System.out.println(name);
                }
            }
        }
    }
}
