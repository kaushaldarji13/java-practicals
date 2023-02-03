public class InstanceControlFlow {
    int i = 10;
    {
        m1();
        System.out.println("parent First instance block");
    }
    InstanceControlFlow(){
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlow t = new InstanceControlFlow();

        System.out.println("Main");
    }
    public void m1(){
        System.out.println(j);
    }
   /* {
        System.out.println("Second instance block");
    }*/
    int j = 20;
}
