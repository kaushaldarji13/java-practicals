public class StaticControlFlow2 extends StaticControlFlow{
    static int x = 100;
    static {
        m2();
        System.out.println("Derived First static block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Derived main");
    }
    public static void m2(){
        System.out.println(y);
    }
    static {
        System.out.println("Derived Second static block");
    }
    static int y = 200;
}
