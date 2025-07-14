class Throw{

    static void callMe(){
        try {
            throw new NullPointerException("Hello");
        }
        catch (NullPointerException e){
            System.out.println("catch inside of method");
        }
    }
    public static void main(String[] args) {
        try{
            callMe();
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}