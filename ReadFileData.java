import java.io.*;

class ReadFileData{
    public static void main(String[] args) {
        int i;
        FileInputStream fin=null;
        try {
            fin = new FileInputStream("C:\\Java Programs\\MyFile.txt");
        }catch (FileNotFoundException e) {
            System.out.println("File not found!! Exception handled...");
        }
        try{
            do{
                i = fin.read();
                if( i != 1 )
                    System.out.println((char) i );
            }while(i!=-1);
            fin.close();
        }catch (IOException e) {
            System.out.println("Reading error....");
        }
    }
}