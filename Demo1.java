class SetterGetter
{
 int empid;
 String name;


 public void setEmpId(int empid)
 {
  this.empid=empid;
 }

 public int getEmpId()
 {
  return empid;
 }

 public void setName(String name)
 {
  this.name=name;
 }

 public String getName()
 {
  return name;
 }
}
 public class Demo1{
  public static void main(String args[])
  {
   SetterGetter sg=new SetterGetter();
   sg.setEmpId(100);
   sg.setName("Om Prakash");

   System.out.println("My Emp id: "+sg.getEmpId());
   System.out.println("My Name: "+sg.getName());

}
}