// methods and concstructors and super class constructor
class Box {
    double width, height, depth;
    // default Conctructor
    Box(){
        width=0;
        height=0;
        depth=0;
    }
    // one parameter Constructor
    Box(double len){
        width=len;
        height=len;
        depth=len;
    }
    // three parameter constructor
    Box(double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    // copy constructor
    Box(Box b){
        this.width=b.width;
        this.height=b.width;
        this.depth=b.depth;
    }
    double volume(){
	return width*height*depth;
    }
}
class BoxWeight extends Box{
	double weight;
	BoxWeight(double width, double height, double depth,double weight){
		this.width=width;
		this.height=height;
		this.depth=depth;
		this.weight=weight;
	}
    	double volume(){
		super.volume();
		return width*height*depth*weight;
    	}	
}

public class Demo5{
	public static void main(String args[]){
	  Box b1=new Box();
	  Box b2=new Box(9);
	  Box b3=new Box(15,5,4);
	  Box b4=new Box(b2);

	  System.out.println("Box1: "+b1.volume());
	  System.out.println("Box2: "+b2.volume());
	  System.out.println("Box3: "+b3.volume());
	  System.out.println("Box4: "+b4.volume());

	  BoxWeight bw=new BoxWeight(2,8,6,4);
	  System.out.println("Weighted Box: "+bw.volume());
	  
	}
}