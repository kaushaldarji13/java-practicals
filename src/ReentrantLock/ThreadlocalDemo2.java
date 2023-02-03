package ReentrantLock;



class ParentThread extends Thread
{
    public static InheritableThreadLocal tl = new InheritableThreadLocal();

    public void run(){
        tl.set("pp");
        System.out.println("Parent Thread Value--"+tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
class ChildThread extends Thread{
    public void run(){
        System.out.println("Child Thread Value---"+ParentThread.tl.get() );
    }
}
public class ThreadlocalDemo2 {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}
