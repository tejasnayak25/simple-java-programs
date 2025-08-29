package file_handling;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("./outputs/demo1.txt");
            fw.write("Hello World\n");
            fw.write("Welcome to Java Programming");
            fw.flush();
            System.out.println("File Written Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
