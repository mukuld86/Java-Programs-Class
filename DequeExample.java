import java.util.*;
class DequeExample{
    public static void main(String[] args) {
        Deque<String>deque = new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s: deque) {
            System.out.println(s);
        }
        deque.poll();
        deque.pollFirst();
        deque.pollLast();
        System.out.println("After pollLast() traversal...");
        for(String s: deque){
            System.out.println(s);
        }

    }
}