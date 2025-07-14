import java.util.*;
class ArrayListDemo{
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(10);
//        list.add(12.36);
//        list.add("CSE");
//        System.out.println(list);
//
        /*

         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("EEE");
        list.add("ECE");
        list.add("CSE");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println(list2);

        List<Integer> list3 = Arrays.asList(2,6,8,9,5,4);
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>();
        for(int i: list3){
            if(i%2==0)
                list4.add(i);
        }
        System.out.println(list4);
    }
}
