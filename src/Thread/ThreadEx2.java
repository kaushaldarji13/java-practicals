package Thread;
class NThread extends Thread{

}
public class ThreadEx2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); // get thread name
        Mythread t = new Mythread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Kaushal");
        System.out.println(Thread.currentThread().getName());
    }
}
