interface  MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

class MyClass <T extends Comparable<T>> implements MinMax<T>{
    T[] vals;
    MyClass(T[] t){
        vals=t;
    }
    public T min(){
        T v=vals[0];
        for(int i=1; i<vals.length; i++){
            if(vals[i].compareTo(v)<0)
                v=vals[i];
        }
        return v;
    }
    public T max(){
        T v=vals[0];
        for(int i=1; i<vals.length; i++){
            if(vals[i].compareTo(v)>0)
                v=vals[i];
        }
        return v;
    }
}

class Test5{
    public static void main(String[] args) {
        Integer n[]={3,9,8,2,4,5};
        Character ch[]={'c','o','m','p','u','t','e','r'};

        MyClass <Integer> obj1 = new MyClass<Integer>(n);
        System.out.println("Object 1 Max val: "+obj1.max());
        System.out.println("Object 1 Min val: "+obj1.min());

        MyClass <Character> obj2 = new MyClass<Character>(ch);
        System.out.println("Object 2 Max val: "+obj2.max());
        System.out.println("Object 2 Min val: "+obj2.min());


    }
}