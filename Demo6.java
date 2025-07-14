// Inheritance, Method overriding( Dynamic Polymorphism), 

class A{
	void callMe(){
		System.out.println("I am callMe() from class A");
	}
}
class B extends A{
	void callMe(){
		System.out.println("I am callMe() from class B");
	}
}
class C extends A{
	void callMe(){
		System.out.println("I am callMe() from class C");
	}
}

class Demo6{
	public static void main(String args[]){
		A a=new A();
		B b=new B();
		C c=new C();
		a.callMe();
		b.callMe();
		c.callMe();
		A ref=new A();
		ref.callMe();
		ref=b;
		ref.callMe();
		ref=c;
		ref.callMe();
	}
}