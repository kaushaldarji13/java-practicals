public class StaticControlFlow {
    static int i = 10;

    static {
        m1();
        System.out.println("Base First static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Base main method");
    }
    public static void m1(){

        System.out.println(j);
    }

   /* static {
        System.out.println("Second static block");
    }*/
    static int j = 20;
}
