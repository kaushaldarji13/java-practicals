package MethodLocalInnerClass;

public class Outer2 {
    public void m1(){
        int x = 10;
        class Inner{
            public void m2(){
                System.out.println(x);
            }
        }
        Inner i = new Inner();
        i.m2();
    }

    public static void main(String[] args) {
        Outer2 o2 = new Outer2();
        o2.m1();
    }
}
