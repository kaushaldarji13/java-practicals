package Thread;
class MyRunnable implements Runnable{
    public void run(){
        for (int i=0; i<10;i++){
            System.out.println("Child class");
        }
    }
}
public class ThreadEx1 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r );               // target runnable
        t.start();

        for (int i=0; i<10;i++){
            System.out.println("Main class");
        }
    }
}
