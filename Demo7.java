/*
Abstraction
1. We cannot create object for abstract class
2. Abstract class may contain non-abstract method

*/
abstract class Figure{
	double d1,d2;
	abstract double area();
	Figure(double d1, double d2){
		this.d1=d1;
		this.d2=d2;
	}
	void show(){
		System.out.println("I am not overrideable");
	}
}
class Rectangle extends Figure{
	double area(){
		return d1*d2;
	}
	Rectangle(double x, double y){
		super(x,y);
	}
	void show(){
		
	}
}
class Demo7{
   public static void main(String args[]){
	//Figure f=new Figure(); 	// doesn't work
	Rectangle r=new Rectangle(6,9);
	System.out.println(r.area());
	
   }
}