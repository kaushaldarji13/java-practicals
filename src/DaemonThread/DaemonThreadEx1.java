package DaemonThread;
class MyThread1 extends Thread{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("child thread");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
        }
    }
}
public class DaemonThreadEx1 {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.setDaemon(true);
        t.start();
        System.out.println("--end of main thread--");
    }
}
