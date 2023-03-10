package ReentrantLock;
import java.util.concurrent.locks.*;

class MyThread1 extends Thread
{
    static ReentrantLock l = new ReentrantLock();
    MyThread1(String name)
    {
        super(name);
    }
    public void run()
    {
        if (l.tryLock()){
            System.out.println(Thread.currentThread().getName()+"....got lock and performing safe operations");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
            l.unlock();
        }
        else {
            System.out.println(Thread.currentThread().getName()+"....unable to get lock and hence performing alternative operations");
        }
    }
}
public class TryLockDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("First thread");
        MyThread1 t2 = new MyThread1("Second thread");
        t1.start();
        t2.start();
    }
}
