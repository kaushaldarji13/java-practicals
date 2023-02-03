package SynchronizationEx;

class  Display1{
    public synchronized void displayno (){
        for(int i= 0; i<10; i++){
            System.out.print(i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){

            }
        }
    }
    public synchronized void displaychar(){
        for (int i = 65; i<=75; i++){
            System.out.print((char)i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){

            }
        }
    }

}
class MyThread1 extends Thread{
    Display1 d;
    MyThread1(Display1 d){
        this.d = d;
    }
    public void run(){
        d.displayno();
    }
}

class MyThread2 extends Thread{
    Display1 d;
    MyThread2(Display1 d){
        this.d= d;
    }
    public void run(){
        d.displaychar();
    }
}
public class SynchronizationEx1 {
    public static void main(String[] args) {
        Display1 d = new Display1();

        MyThread2 t2 = new MyThread2(d);
        MyThread1 t1 = new MyThread1(d);

        t2.start();
        t1.start();

    }
}
