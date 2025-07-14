import java.util.Scanner;
interface CA1{
  void resultCA1();
}

interface CA2{
  void resultCA2();
}

interface ETP{
  void resultETP();
}

class Result implements CA1, CA2, ETP{
 int ca1, ca2, etp;
 Scanner sc=new Scanner(System.in);
 public void resultCA1(){
	System.out.print("Enter marks of CA1: ");
	ca1=sc.nextInt();
 }
 public void resultCA2(){
	System.out.print("Enter marks of CA2: ");
	ca2=sc.nextInt();
 }
 public void resultETP(){
	System.out.print("Enter marks of ETP: ");
	etp=sc.nextInt();
 }
 void totalResult(){
	int total=ca1+ca2+etp;
	System.out.println("Total marks: "+total);
 }
 public static void main(String args[]){
	Result r=new Result();
	r.resultCA1();
	r.resultCA2();
	r.resultETP();
	r.totalResult();

 }
}