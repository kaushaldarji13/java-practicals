package MethodLocalInnerClass;



public class Outer3 {
    int i = 10;
    static int j = 20;

    public  void m1(){
         int k = 30;
        final int m = 40;
        class Inner{
            public void m2(){
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
                System.out.println(m);
            }
        }
        Inner i = new Inner();
        i.m2();
    }

    public static void main(String[] args) {
        Outer3 o3 = new Outer3();
        o3.m1();
    }
}
