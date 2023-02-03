package joinMethod;
class MyNewThread extends Thread{
    static Thread mt;                            // mt is main thread obj
    public void run(){
        try {
            mt.join();                           // after completing main thread ,child thread will execute
        }
        catch (InterruptedException e){

        }
        for (int i = 0; i<10; i++){
            System.out.println("child thread");

        }
    }
}
public class JoinMethodEx1 {
    public static void main(String[] args) throws Exception {
         MyNewThread.mt = Thread.currentThread();
         MyNewThread t = new MyNewThread();
         t.start();
        // t.join();                      if we take it then deadlock occurs
         for (int i = 0; i<10; i++){
             System.out.println("main thread");
             Thread.sleep(500);
         }
    }
}
