// Propagation of Exception
class TestPE{

    public void first(){
        int a = 50/0;
    }

    public void second(){
        first();
    }

    public void third(){
        try {
            second();
        }catch (Throwable t){
            System.out.println(t);
        }finally {
            System.out.println("Finally block called...");
        }
    }

    public static void main(String[] args) {
        TestPE obj = new TestPE();
        obj.third();
        System.out.println("Propagation Exception Tested...");
    }
}