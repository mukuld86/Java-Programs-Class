class AssertionCheck{
    public static void main(String[] args) {
        AssertionCheck checker=new AssertionCheck();
        checker.remainder(6);
        checker.remainder(7);
        checker.remainder(8);


    }
    void remainder(int i){
        if(i%3==0)
            System.out.println("Divisible by 3");
        else if(i%3==1)
            System.out.println("Remainder 1");
        else {
            assert i%3==2 : i;
            System.out.println("Remainder 2");
        }
    }
}