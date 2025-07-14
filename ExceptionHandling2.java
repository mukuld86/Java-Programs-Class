class ExceptionHandling2{
    static int x,y;

    public static void main(String[] args) {
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            System.out.println(x + y);
            System.out.println(x / y);
        } catch (Throwable t){
            System.out.println(t);
        }
    }
}