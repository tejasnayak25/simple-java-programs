package file_handling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File f = new File("./outputs");
        boolean b = f.exists();
        if(b == false) {
            f.mkdir();
            System.out.println("Folder Created");
        } else {
            System.out.println("Dabba Fellow file already exists");
        }
    }
}
