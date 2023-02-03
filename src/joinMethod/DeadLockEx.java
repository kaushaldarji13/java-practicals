package joinMethod;

public class DeadLockEx {
    public static void main(String[] args) throws InterruptedException  {
        Thread.currentThread().join();
    }
}
