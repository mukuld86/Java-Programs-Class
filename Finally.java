class Finally{

    public static void main(String[] args) {
        try {
            String name = "CSE";
            System.out.println(name.length());
            System.out.println(name.charAt(8));
        } catch(NullPointerException e) {
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block called!");
        }
    }
}