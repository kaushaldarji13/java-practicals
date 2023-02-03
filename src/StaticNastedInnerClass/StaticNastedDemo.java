package StaticNastedInnerClass;

public class StaticNastedDemo {
    static class Nested{
        public void m1(){
            System.out.println("static nested inner class");
        }
    }

    public static void main(String[] args) {
        Nested n = new Nested();
        n.m1();
    }
    StaticNastedDemo.Nested n = new StaticNastedDemo.Nested();
}

