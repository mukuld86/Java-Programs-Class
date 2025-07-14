class Polygon{
 void display(){
	System.out.println("method of polygon");
 }
}

class Test{
 void showMe(){
	Polygon p = new Polygon(){
	  void display(){
	    System.out.println("Method of anonymmous class");
	  }
	};
	p.display();

 }
}
class TestAnonymous{
  public static void main(String[] args){
	Test t1=new Test();
	t1.showMe();
	Test t2=new Test();
	t2.showMe();


  }
}