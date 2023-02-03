package StaticNastedInnerClass;
public class StaticNestedDemo2 {
    int x = 10;
    static int y = 20;
    static class Nested{
        public void m1(){
//            System.out.println(x);
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        StaticNastedDemo.Nested n = new StaticNastedDemo.Nested();
        n.m1();

    }
}
