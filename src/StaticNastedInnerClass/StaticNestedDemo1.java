package StaticNastedInnerClass;

public class StaticNestedDemo1 {
    static class Nested{
        public static void main(String[] args) {
            System.out.println("static class main method");
        }
    }

    public static void main(String[] args) {
        System.out.println("outer class main method");
    }
}
