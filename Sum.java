import java.util.Scanner;
public class Sum{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int size;
	System.out.print("Enter the array size: ");
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.print("Enter "+size+" integers: ");
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
	for(int num:arr){
		System.out.println(num);
	}	
}
}