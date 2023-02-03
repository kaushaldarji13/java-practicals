package RegularInnearClass;
// accessing inner class code from instance area of outer class
public class Outer1 {
    class Inner{
        public void m1(){
            System.out.println("inner class method");
        }
    }
    public void m2(){
        Inner i = new Inner();
        i.m1();
    }

    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.m2();
    }
}
