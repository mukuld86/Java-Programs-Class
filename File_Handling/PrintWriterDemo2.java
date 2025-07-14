import java.io.*;
public class PrintWriterDemo
{
    public static void main(String[] args)
    {
        String data="Welcome in LPU, Punjab";
        try {
            PrintWriter output= new PrintWriter("p1.txt");
            output.print(data);
            output.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}