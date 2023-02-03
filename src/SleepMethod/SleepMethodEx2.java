package SleepMethod;
class MyNewThread extends Thread{
    public void run(){

            for (int i = 0; i<=10; i++){
                System.out.println("I am lazy Thread");
            }
        System.out.println("I am entering into sleeping state");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println("i got Interrupted");
            }
    }
}
public class SleepMethodEx2 {
    public static void main(String[] args) {
        MyNewThread t = new MyNewThread();
        t.start();
        t.interrupt();
        System.out.println("End of main thread");

    }
}
