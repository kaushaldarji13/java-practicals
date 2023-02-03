package Thread;
class Newthread extends Thread{

    // overloaded methods
    public void start()
    {
        super.start();
        //job of thread
        System.out.println("start method");
    }
    public void run()
    {
        //job of thread
        System.out.println("run method");
    }

}
public class ThreadOverriding {
    public static void main(String[] args) {
        Newthread t = new Newthread(); // Thread instantiation
        t.start();

        System.out.println("main method ");// Starting of a thread


    }
}
