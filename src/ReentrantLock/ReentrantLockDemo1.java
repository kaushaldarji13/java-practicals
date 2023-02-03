package ReentrantLock;
import java.util.concurrent.locks.*;
class Display{
    static ReentrantLock l = new ReentrantLock();
    public  static  void wish(String name){
        l.lock();
        for (int i=0;i<10;i++){
            System.out.print("Good morning:");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e){
            }
            System.out.println(name);

        }
        l.unlock();
    }
}

class MyThread extends Thread{
    Display d;
    String name;

    MyThread(Display d , String name){
        this.d= d;
        this.name= name;
    }
    public void run(){
        d.wish(name);
    }
}

public class ReentrantLockDemo1 {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1,"dhoni");
        MyThread t2 = new MyThread(d2,"yuvraj");
        t1.start();
        t2.start();
    }
}
