package RegularInnearClass;
// nested inner class
public class Outer5 {

    class Inner1{
        class Inner2{
            public void m1(){
                System.out.println("deep most inner class");
            }
        }
    }

    public static void main(String[] args) {
        new Outer5().new Inner1().new Inner2().m1();
    }
}
