enum Direction{North, South, East, West};

class Demo4{
 public static void main(String args[]){
	for(Direction d:Direction.values()){
	   System.out.println("Index: "+d.ordinal()+" = "+d);
	}
	
	System.out.println("ValueOF: "+Direction.valueOf("East"));
	System.out.println("Index value of: "+Direction.valueOf("East").ordinal());
	// ordinal() is used to return the index of the value

	
 }
}