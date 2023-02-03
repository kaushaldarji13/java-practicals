package joinMethod;
class Mythread extends Thread{
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
public class JoinMethodEx {
    public static void main(String[] args) throws InterruptedException {
        Mythread t = new Mythread();
        t.start();
        t.join(10000);      // wait main thread until complete child thread
        for (int i=0; i<10; i++){
            System.out.println("main thread");
        }
    }
}
