/* create an interface named as Fruit and define one method named billAmount.
   Override that method in class Apple and Orange and print the bill amount to b paid to the shopkeeper. Take two attributes in this class  double price and int quantity 

*/
interface Fruit{
 abstract double billAmount();
}
class Apple implements Fruit{
 double price;
 int quantity;
 @Override
 public double billAmount(){
	return price*quantity;
	
 }
}
class Orange implements Fruit{
 double price;
 int quantity;
 @Override
 public double billAmount(){
	return price*quantity;	
 }
}
class MyClass1{
 public static void main(String args[]){
	Apple a1=new Apple();
	a1.price=30;
	a1.quantity=15;
	System.out.println("Apple bill at price Rs.30/Apple and for quantity 15 = "+ a1.billAmount());

	Orange o1=new Orange();
	o1.price=40;
	o1.quantity=20;
	System.out.println("Orange bill at price Rs.40/Orange and for quantity 20 = "+ o1.billAmount());

 }
}