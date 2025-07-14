class MyEnum{
 enum Food{
	samosa(15), pizza(150), jalebi(120), dosa(60);
	int price;
	Food(int prc){
		price=prc;
	}
 }
 public static void main(String args[]){
	for(Food f:Food.values()){
		System.out.println(f+" : "+f.price);
	}
 }
}