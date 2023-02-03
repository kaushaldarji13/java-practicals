package Thread;
//thread defining by extending thread class
class Mythread extends Thread{
    public void run()
    {
        //job of thread
        for (int i = 0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
public class ThreadEx {
    public static void main(String[] args) {
        Mythread t = new Mythread(); // Thread instantiation
        t.run();                   // Starting of a thread

        // Executed by main thread
        for (int i = 0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
