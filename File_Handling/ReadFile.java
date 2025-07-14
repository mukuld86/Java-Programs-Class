import java.io.*;

class ReadFile{
    public static void main(String[] args) throws IOException{
        int i;
//            FileInputStream f = new FileInputStream("C:\\Java Programs\\File Handling\\Text.txt");
        FileInputStream f = new FileInputStream("Test.txt");

        do {
            i = f.read();
            if (i != -1) {
                System.out.print((char) i);
            }
        } while (i != -1);
        f.close();
    }
}