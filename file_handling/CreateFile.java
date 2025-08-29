package file_handling;
import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("./outputs/demo1.txt");
        boolean b = f.exists();
        if(b == false) {
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Dabba Fellow file already exists");
        }
    }
}