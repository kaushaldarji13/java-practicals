package MethodLocalInnerClass;

public class Outer {
    public void m1(){
        class Inner{
            public void Sum(int x, int y ){
                System.out.println("the sum: "+ (x+y));
            }

        }
        Inner i = new Inner();
        i.Sum(10,20);
        i.Sum(100,200);
        i.Sum(1000,2000);
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.m1();
    }
}
