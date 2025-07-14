class MyException extends Exception{

    public MyException(int i){
        System.out.println("You have entered: " + i);
    }

}

class TestException{
    public void show(int i) throws MyException{
        if(i >= 100)
            throw new MyException(i);
        else
            System.out.println(i + "is less than 100");
    }
    public static void main(String[] args) {
        int s = Integer.parseInt(args[0]);
        TestException t = new TestException();
        try{
            t.show(s);
        }catch (Throwable e){
            System.out.println(e);
        }

    }
}
