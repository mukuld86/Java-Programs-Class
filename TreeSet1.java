import java.util.TreeSet;
import java.util.Iterator;
class TreeSet1{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Coconut");
        ts.add("Apple");

        System.out.println("\nAscending order: ");
        Iterator<String> itr1 = ts.iterator();
        while(itr1.hasNext())
            System.out.println(itr1.next());

        System.out.println("\nDescending Order: ");
        Iterator itr2 = ts.descendingIterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());

    }
}