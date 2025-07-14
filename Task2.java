import  java.util.*;
class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=50; i++){
            if(i%5==0)
                list.add(i);
        }

        System.out.println(list);
    }
}