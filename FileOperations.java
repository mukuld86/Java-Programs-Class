import java.io.File;
import java.io.IOException;

class FileOperations{
    public static void main(String[] args) {
        try {
            File f = new File("MyFile.txt");
            if (f.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File could not be created");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}