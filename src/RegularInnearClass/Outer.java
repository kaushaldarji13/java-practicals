package RegularInnearClass;
// accessing inner class code from static area of outer class

public class Outer {

    class Innear{
        public void m1(){
            System.out.println("Inner class method ");
        }

    }
    public static void main(String[] args) {
        System.out.println("xyz");
//        Outer o = new Outer();
        new Outer().new Innear().m1();
//        n.m1();
    }


}
