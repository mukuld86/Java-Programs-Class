public class Demo{
 public static void main(String args[]){
/*	
	String s1="Java";
	String s2="Java";

	String t1=new String("Java");
	String t2=new String("Java");

	System.out.println("using ==");
	System.out.println(s1==s2);
	System.out.println(t1==t2);

	System.out.println("using equals()");
	System.out.println(s1.equals(s2));
	System.out.println(t1.equals(t2));
*/
	StringBuilder s1=new StringBuilder("Java");
	StringBuilder s2=new StringBuilder("Java");
	
	System.out.println("using ==");
	System.out.println(s1==s2);

	System.out.println("using equals()");
	System.out.println(s1.equals(s2));

 }
}