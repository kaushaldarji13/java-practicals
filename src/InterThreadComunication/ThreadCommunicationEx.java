package InterThreadComunication;
class ThreadB extends Thread{
    int total= 0;
    public void run(){
           synchronized (this){
               System.out.println("child thread start calculation");
               for (int i = 1  ; i<=100 ; i++){
                   total = total + i;

               }
               System.out.println("child giving notification call");
               this.notify();

           }
    }
}
public class ThreadCommunicationEx {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b= new ThreadB();
        b.start();
//        Thread.sleep(10000);

//        Thread.sleep(2000);
//        b.join();
        synchronized (b){
            System.out.println("main thread trying to call wait() method");
            b.wait();
            System.out.println("main thread got notification");
            System.out.println(b.total);
        }

    }
}
