import java.io.*;
class TestReader{
    public static void main(String[] args){
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    } catch(Exception e){
        e.printStackTrace();
    }
    }
}