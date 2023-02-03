package DaemonThread;
class Mythread extends Thread{

}
public class DaemonThreadEx {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon()); //main thread is non-daemon
       // Thread.currentThread().setDaemon(true);

        Mythread t = new Mythread();
        System.out.println(t.isDaemon());
       t.setDaemon(true);
        System.out.println(t.isDaemon());

    }
}
