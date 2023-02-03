package AnonymousInnerClass;
// anonymous inner class that implements an interface
// Defining a thread by implementing runnable interface


public class AnonymousDemo3 {
    public static void main(String[] args) {
        Runnable r = new Runnable()
        {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("child thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i<10; i++){
            System.out.println("main thread");
        }
    }
}
