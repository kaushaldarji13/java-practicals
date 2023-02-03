package StaticNastedInnerClass;
// defining interface inside interface

interface Outer {
    public void m1();
        interface Inner{
            public void m2();
        }
}
public class StaticNestedDemo3 implements Outer {
    public void m1(){
        System.out.println("Outer interface Method Implementation");
    }
}
class Xyz implements Outer.Inner{
    public void m2(){
        System.out.println("Inner interface Method Implementation");
    }
}
class Test{
    public static void main(String[] args) {
       StaticNestedDemo3 t1 = new StaticNestedDemo3();
       t1.m1();

       Xyz t2 = new Xyz();
       t2.m2();
    }
}
