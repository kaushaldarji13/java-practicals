package Autoboxing;

// autoboxing vs var-arg method
public class Demo6 {
    public static void m1(Integer I){
        System.out.println("AutoBoxing");
    }

    // list priority so that autoboxing will get chance
    public static void m1(int... x){
        System.out.println("var-arg method");
    }
    public static void main(String[] args) {
        int x = 10;
        m1(x);
    }
}
