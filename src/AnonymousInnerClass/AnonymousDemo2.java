package AnonymousInnerClass;
// Anonymous class method to defining a thread
public class AnonymousDemo2 {
    public static void main(String[] args) {
        Thread t= new Thread(){
            public void run(){
                for (int i = 0; i<10; i++){
                    System.out.println("child thread");
                }
            }
        };
        t.start();

        for (int i = 0; i<10; i++){
            System.out.println("main thread");
        }
    }
}
