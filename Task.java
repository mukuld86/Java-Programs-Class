import java.io.*;

// write a java program to write through I/O screen the details like Roll no, Name, Fee. And display it.
class Student{
    int rollno;
    String name;
    double fee;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void readData() throws IOException {
        rollno = Integer.parseInt(br.read());
        name = (String) br.read();
        fee = Double.parseDouble(br.read());
    }

    void showData(){
        System.out.println("RollNo: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Fee: "+fee);
    }

    public static void main(String[] args) {
        readData();
        showData();
    }
}