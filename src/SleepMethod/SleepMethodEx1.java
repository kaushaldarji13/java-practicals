package SleepMethod;
class Mythread extends Thread{
    public void run(){
        try{
            for (int i = 0; i<=10; i++){
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println("I got Interrupted");
        }
    }
}
public class SleepMethodEx1 {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.interrupt();                      // interrupt child thread
        System.out.println("End of Main");
    }
}
