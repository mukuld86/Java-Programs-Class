import java.util.Scanner;

interface MathOperation{
    public abstract int calcualte(int n);
}
class CubeOperation implements MathOperation{
    public static int calculate(int n){
        return n*n*n;
    }
}
class ProductOperation implements MathOperation{
    public static int calculate(int n){
        int product=1;
        for(int i=1; i<=n; i++){
            product*=i;
        }
        return product;
    }
}
class Sample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }
}