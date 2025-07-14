// Generics P1
class TwoGen<T,V>{
    T obj1;
    V obj2;
    TwoGen(T o1, V o2){
        obj1=o1;
        obj2=o2;
    }
    T getT(){
        return obj1;
    }
    V getV(){
        return  obj2;
    }

}
class Test3{
    public static void main(String[] args) {
        TwoGen<Integer, String> obj1 = new TwoGen<Integer, String>(12204005,"Mukul Deshwal");
        System.out.println(obj1.getT());
        System.out.println(obj1.getV());

        TwoGen<Integer, Double> obj2 = new TwoGen<Integer, Double>(12204005, 8.14);
        System.out.println(obj2.getT());
        System.out.println(obj2.getV());
    }
}