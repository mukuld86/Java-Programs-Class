import java.util.*;
public class Input_Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.: "); 
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println(a+" is an even number");
		else
			System.out.println(a+" is an odd number");

}
}