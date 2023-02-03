package DeadLock;
// also write in book
class A{
    public synchronized void d1(B b){
        System.out.println("Thread 1 starts execution of d1()");
        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException e){

        }
        System.out.println("Thread 1 trying to call B's  last() ");
        b.last();

    }
    public synchronized void last(){
        System.out.println("inside A, this is last() method");
    }
}

class B{
    public synchronized void d2(A a){
        System.out.println("Thread 2 starts execution of d1()");
        try {
            Thread.sleep(6000);
        }
        catch (InterruptedException e){

        }
        System.out.println("Thread 2 trying to call A's last() ");
        a.last();

    }
    public synchronized void last(){
        System.out.println("inside B, this is last() method");
    }
}

//class Deadlock extends Thread{




public class DeadlockEx extends Thread {

    A a = new A();
    B b = new B();
    public void m1(){
        this.start();
        a.d1(b); // this line executes by main thread
    }
    public void run(){
        b.d2(a); // this line executes by child thread
    }

    public static void main(String[] args) {
        DeadlockEx d = new DeadlockEx();
        d.m1();

    }

}
