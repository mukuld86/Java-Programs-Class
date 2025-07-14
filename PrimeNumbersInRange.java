import java.util.Scanner;
class PrimeNumbersInRange{
    public static boolean prime(int n){
        if(n<2)
            return false;
        else if(n==2)
            return true;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Prime numbers less than "+n+" are: ");
        for(int i=1;i<n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
}