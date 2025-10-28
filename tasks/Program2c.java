package tasks;

public class Program2c {
    public static void main(String[] args) {
        String[][][] blocks = {
            {
                {"Tejas", "Swasthik"},
                {"Karan", "Pavan"}
            },
            {
                {"Rajat", "Vijay"},
                {"Anu", "Deepa"}
            }
        };
        System.out.println("--- Reversed 3D Names ---");
        for (int i = blocks.length - 1; i >= 0; i--) {
            for (int j = blocks[i].length - 1; j >= 0; j--) {
                for (int k = blocks[i][j].length - 1; k >= 0; k--) {
                    System.out.println(blocks[i][j][k]);
                }
            }
        }
    }
}
