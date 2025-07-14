import java.lang.reflect.Array;
import java.util.*;

public class ExceptionHandling{
    public static void main(String[] args) {
        int n1 = 0, n2=0;

        try {
            try {
                n1 = Integer.parseInt(args[0]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out of Bounds error: " + e.getMessage());
            }

        try {
            n2 = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds error: " + e.getMessage());
        }
            // inner try catch block finish
        }
        // outer catch block
        catch (NumberFormatException e) {
            System.out.println("Please provide valid integer arguments.");
        }
            System.out.println("n1 + n2 = " + (n1 + n2));
            System.out.println("n1 - n2 = " + (n1 - n2));
            System.out.println("n1 * n2 = " + (n1 * n2));
            try {
                System.out.println("n1 / n2 = " + (n1 / n2));
                System.out.println("n1 % n2 = " + (n1 % n2));
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            }
    }
}
