package Thread;
class MyNthread extends Thread{
    public void run()
    {
        System.out.println("this line executed by thread:"+Thread.currentThread().getName());



    }
}
public class ThreadEx3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        MyNthread t = new MyNthread(); // Thread instantiation
        t.start();
        System.out.println(t.getPriority());
        System.out.println("this line executed by thread:"+Thread.currentThread().getName());




    }
}