public class ex {
    {
        m1();
    }
    {
        m2();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }

   /* ex(){
        this(10);
    }
    ex(int i){
        this();
    }*/

    public static void main(String[] args) {
        System.out.println("hello");
//        ex x1 = new ex();

    }

}
