class StringBuilder_Demo{
 public static void main(String args[]){
/*
 	StringBuilder sb1=new StringBuilder();
	System.out.println(sb1.capacity());
	sb1.append("Java");
	System.out.println(sb1.capacity());
	sb1.append("Computer Science and Engineering");
	System.out.println(sb1.capacity());

// append() and insert()
	StringBuilder sb1=new StringBuilder("CSE");
	System.out.println(sb1);
	sb1.append(" LPU");
	System.out.println(sb1);
	sb1.insert(3,"Java");
	System.out.println(sb1);
	
//checking palindrome
	StringBuilder sb2=new StringBuilder("madam");
	StringBuilder sb3;
	sb3=sb2.reverse();
	System.out.println("sb2 is a palindrome: "+(sb2==sb3));
*/
// deleteCharAt()
	StringBuilder sb1=new StringBuilder("CSE");
	System.out.println(sb1);
	sb1.append(" LPU");
	System.out.println(sb1);
	sb1.insert(3,"Java");
	System.out.println(sb1);
	sb1.deleteCharAt(3);
	System.out.println(sb1);
	 

}
}