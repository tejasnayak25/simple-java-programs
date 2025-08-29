package file_handling;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("./outputs/demo2.txt");
        boolean b = f.exists();
        if(b == true) {
            f.delete();
            System.out.println("File Deleted");
        } else {
            System.out.println("File does not exist");
        }
    }
}
