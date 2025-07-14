import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ReadFile{
    public static void main(String[] args) {
        try{
        File file = new File("C:\\Java Programs\\MyFile.txt");
        if(file.exists())
            System.out.println("File found!!");
            BufferedReader reader = new BufferedReader(new FileReader(file) );
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error reading the file!");
        }
    }
}