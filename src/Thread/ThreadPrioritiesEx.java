package Thread;
class MmyThread extends Thread{
    public void run(){
        for (int i = 0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
public class ThreadPrioritiesEx {
    public static void main(String[] args) {
        MmyThread t = new MmyThread();
        t.setPriority(10);
        t.start();

        for (int i = 0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
