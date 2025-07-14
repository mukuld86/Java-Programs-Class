interface Fruit{
 int x =10;
 default void callMe(){
	System.out.println("It is a method in interface");
 }
}

class Apple implements Fruit{
 void show(){
	//x=15;
	System.out.println(x);
 }
}

class Test2{
 public static void main(String args[]){
	Apple a = new Apple();
	a.show();
	a.callMe();
 }
}