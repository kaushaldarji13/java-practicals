public class WithoutMain {

    static int x=m1();

    {
        System.out.println("I can print");
    }
    public static int m1()
    {
        System.out.println("I can print");
        System.exit(0);
        return 0;
    }

    public static void main(String[] args) {

    }

}
