package AnonymousInnerClass;
class Popcorn{
    public void taste(){
        System.out.println("Salty");
    }
}
public class AnonymousDemo {
    public static void main(String[] args) {

        // anonymous inner class
        Popcorn p = new Popcorn(){
          public void taste(){
                System.out.println("spicy");
            }
        };
        p.taste();

        // normal object creation and method call
        Popcorn p1 = new Popcorn();
        p1.taste();

        //anonymous inner class
        Popcorn p2 = new Popcorn()
        {
          public void taste(){
            System.out.println("sweet");
          }
        };
        p2.taste();
        System.out.println(p.getClass().getName());
        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());

    }
}
