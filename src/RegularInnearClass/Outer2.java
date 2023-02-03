package RegularInnearClass;
 class OuterEx {
     class Inner{
        public void m1(){
            System.out.println("Inner class method ");
        }
    }
}
public class Outer2 {
    public static void main(String[] args) {
       new OuterEx().new Inner().m1();
    }
}
