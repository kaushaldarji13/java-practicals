package MethodLocalInnerClass;

public class Outer1 {
    int x = 10;
    static int y = 20;

    public void m1(){
        // declare inner class in instance method
        // so we can access  both static and nonstatic member of outer class
        class Inner{
            public void m2(){
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner i = new Inner();
        i.m2();
    }

    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        o1.m1();
    }
}
