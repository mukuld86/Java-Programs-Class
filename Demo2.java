public class Demo2{
 public static void main(String args[]){
	String s="madam";
	StringBuilder sb=new StringBuilder(s).reverse();
	String s2=sb.toString();	
	System.out.println(s2);
	if(s.equals(s2))
		System.out.println("String is palindrome");
	else
		System.out.println("String is not palindrome");

 }
}