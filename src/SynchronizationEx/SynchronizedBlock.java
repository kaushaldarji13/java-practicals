package SynchronizationEx;
class Display2{
    public void  wish(String name){

       // 1 lakh line of code


        // synchronized block for this function
        synchronized (Display2.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Good morning:- ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
                System.out.println(name);
            }
        }
        // 1 lakh line of code
    }
}
class MyNewThread extends Thread{
    Display2 d;
    String name;
    MyNewThread(Display2 d, String name){
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Display2 d = new Display2();
        Display2 d1 = new Display2();

        MyNewThread t1 = new MyNewThread(d,"Dhoni");
        MyNewThread t2 = new MyNewThread(d1,"yuvraj");

        t1.start();
        t2.start();
    }





}
