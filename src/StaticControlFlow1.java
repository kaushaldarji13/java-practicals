 class StaticControlFlow1 {

    static {
        m1();

 }



    public static void m1(){
        System.out.println(x);
    }
    static int x = 10;

    public static void main(String[] args) {
        m1();
    }
}
