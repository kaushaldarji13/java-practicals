package Clone;

public class Demo implements Cloneable {
    int i = 10;
    int j = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        Demo d1 = new Demo();
        Demo d2 =(Demo)d1.clone();
        d2.i= 888;
        d2.j= 999;
        System.out.println(d1.i+" "+d1.j);
        System.out.println(d2.i+" "+d2.j);



    }
}
