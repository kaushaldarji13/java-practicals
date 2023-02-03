package Autoboxing;

public class Demo {
    static Integer I = 10;  // autoboxing

    public static void main(String[] args) {
        int i = I;          // auto unboxing
        m1(i);
    }

    public static void m1(Integer k) // i to Integer k --> autoboxing
    {
        int m = k;                   // Integer to m --> auto unboxing
        System.out.println(m);
    }
}
