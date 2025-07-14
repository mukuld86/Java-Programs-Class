import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ArrayListDemo2{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");
        list.add("Mango");
        System.out.println(list);

        System.out.print("Ascending Order: ");
        Iterator itr=list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        System.out.print("Descending Order: ");
        Iterator itr2=list.descendingItera-tor();
        while(itr2.hasNext())
            System.out.println(itr2.next());

//        Collections.sort(list);
//        System.out.println(list);

    }
}