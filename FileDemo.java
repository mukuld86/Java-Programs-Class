import java.io.*;
class FileDemo{
    public static void main(String[] args) {
        File f = new File("C:\\Java Programs\\Me.txt");
        /*
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
         */

        System.out.println((f.exists()? "File Exists":"Does not Exist" ));
        System.out.println((f.canWrite()? "Can Write":"Cannot Write" ));
        System.out.println((f.isFile()? "Is File":"Is not a file" ));
        System.out.println((f.exists()? "File Exists":"Does not Exist" ));

    }
}