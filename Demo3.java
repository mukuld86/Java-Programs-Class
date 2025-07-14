class Student
{
 int rollno;
 String name;
 double fee;

 public void setRollno(int roll)
 {
  this.rollno=roll;
 }

 public int getRollno()
 {
  return rollno;
 }

 public void setName(String name)
 {
  this.name=name;
 }

 public String getName()
 {
  return name;
 }
  public void setFee(double fee)
 {
  this.fee=fee;
 }
 public double getFee()
 {
  return fee;
 }
 
}
 public class Demo3{
  public static void main(String args[])
  {
   Student s1=new Student();
   s1.setRollno(30);
   s1.setName("Mukul");
   s1.setFee(10000.00);
  
   System.out.println("Roll No: "+s1.getRollno());
   System.out.println("Name: "+s1.getName());
   System.out.println("Fee: "+s1.getFee());

}
}