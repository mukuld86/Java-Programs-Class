// in place of extends we use implements
interface MyStack{
 void push(int p);
 void pop();
 void display();
}
class DemoStack implements MyStack{
 int s[];
 int top;
 DemoStack(int t){
	s=new int[t];
	top=-1;
 }
 public void push(int p){
	if(top==s.length-1)
		System.out.println("Stack overflow");
	else
		s[++top]=p;
 }
 public void pop(){
	if(top<0){
		System.out.println("Stack underflow");
		return;
	}
	else{
		top--;
	}
 }
 public void display(){
	if(top<0){
		System.out.println("Stack empty!");
		return;
	}
	System.out.println("Elements are : ");
	while(top>=0){
		System.out.println(s[top--]);
	}
 }
}
class Test1{
  public static void main(String args[]){
	DemoStack ds=new DemoStack(3);
	ds.push(1);
	ds.push(2);
	ds.push(3);
	ds.push(4);	// overflow
	ds.push(5);	// overflow
	ds.display();
	ds.pop();
	ds.pop();
	ds.pop();
	ds.pop();	// underflow
	ds.display();
  }
}