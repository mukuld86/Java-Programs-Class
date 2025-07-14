/*import java.util.Scanner;
public class AlphabetCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.print("Enter only an alphabet: ");
        ch=sc.next().charAt(0);
        if(!(Character.isLetter(ch))){
            System.out.println("Only alphabets supported!");
            System.exit(0);
        }
        switch(ch){
            case 'A':
            case 'a':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                        System.out.println(ch+" is a vowel");
                        break;
            default:
                        System.out.println(ch+" is a consonant");

        }
        
    }
}
*/
import java.util.*;
class String_buil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char c=sc.next().charAt(0);
        sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < s1.length() - n + 1; i++) {
            System.out.println(s1.substring(i, i + n));
        }
        int count=0;
        for(int i=0;i<s1.length()-1;i++){
            if( c==s1.charAt(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}