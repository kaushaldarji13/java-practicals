class P{

    int x = 888;
    /*public void m1(int... x){
        System.out.println("Parent");
    }*/
}
class C extends P{

    int x = 999;
   /* public void m1(int x){
        System.out.println("Child");
    }*/
}
public class Overriding {
    public static void main(String[] args) {

        /*P p = new P();
        p.m1(10);

        C c = new C();
        c.m1(10);

        P p1 = new C();
        p1.m1(10);*/

        P p = new P();
        System.out.println(p.x);

        C c = new C();
        System.out.println(c.x);

        P p1 = new C();
        System.out.println(p1.x);


    }
}
