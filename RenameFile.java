import java.io.File;
import java.io.IOException;

class RenameFile{
    public static void main(String[] args) {
//        File f1 = new File("Text.txt");
//        f1.createNewFile();
//        if(f1.renameTo(new File("C:\\Users\\ASUS\\AppData\\Roaming\\JetBrains\\IdeaIC2023.3\\scratches\\NewText.txt"))){
//            System.out.println("File renamed successfully!");
//        }else{
//            System.out.println("Error...!");
//        }
        try {
            File f1 = new File("filename.txt");
            if (f1.createNewFile()) {
                System.out.println("File created: " + f1.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if(f1.delete()){
            System.out.println("File deleted successfully!");
        }else{
            System.out.println("Could not delete!");
        }

    }
}