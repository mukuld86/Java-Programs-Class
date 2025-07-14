import java.util.Arrays;
import java.util.List;
class WildCardDemo2{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4,5,6,7);
        showSuperClass(list1);
        List<Number> list2 = Arrays.asList(4,5,6,7);
        showSuperClass(list2);
    }

    private static void showSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }
}