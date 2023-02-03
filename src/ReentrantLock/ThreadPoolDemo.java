package ReentrantLock;
import java.util.concurrent.*;
class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name+"....job started by Thread:"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){

        }
        System.out.println(name+"....job completed by Threads:"+Thread.currentThread().getName());
    }

}
public class ThreadPoolDemo {
    public static void main(String[] args) {
        PrintJob [] jobs = {
                new PrintJob("lalo"),
                new PrintJob("tino"),
                new PrintJob("paso"),
                new PrintJob("bhuro"),
                new PrintJob("hako"),
                new PrintJob("vaso")

        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob job:jobs)
         {
            service.submit(job);
         }
            service.shutdown();
    }
}
