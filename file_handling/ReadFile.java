package file_handling;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        FileReader f = null;
        int ch;
        try {
            f = new FileReader("./outputs/demo1.txt");
            ch = f.read();
            while(ch != -1) {
                System.out.print((char) ch);
                ch = f.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
