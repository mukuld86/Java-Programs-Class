import java.io.*;

class CopyData{
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fis = new FileInputStream("C:\\Java Programs\\File_Handling\\Test.txt");
//        FileOutputStream fos = new FileOutputStream("C:\\Java Programs\\File_Handling\\CopyTest.txt");
        FileOutputStream fos1 = new FileOutputStream("C:\\Java Programs\\File_Handling\\Even.txt");
        FileOutputStream fos2 = new FileOutputStream("C:\\Java Programs\\File_Handling\\Odd.txt");

        do{
            i=fis.read();
            if(i!=1) {
                if((int)i%2==0)
                    fos1.write(i);
                else
                    fos2.write(i);
            }
        }while(i!=-1);
        fis.close();
        fos1.close();
        fos2.close();
    }
}