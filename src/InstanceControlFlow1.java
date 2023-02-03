public class InstanceControlFlow1 extends InstanceControlFlow{
    int x = 100;
    {
        m2();
        System.out.println("Child first instance block");

    }
    InstanceControlFlow1(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlow1 t1 = new InstanceControlFlow1();


        System.out.println("Child main ");
    }
    public void m2(){
        System.out.println(y);

    }
    {
        System.out.println("Child second instance block ");
    }
    int y = 200;
}
