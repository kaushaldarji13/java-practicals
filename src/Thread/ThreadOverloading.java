package Thread;


class MyNewthread extends Thread{

    // overloaded methods
    public void run()
    {
        //job of thread
            System.out.println("no-arg run");
    }
    public void run(int i)
    {
        //job of thread
        System.out.println("int arg run ");
    }

}

public class ThreadOverloading {
    public static void main(String[] args) {
        MyNewthread t = new MyNewthread(); // Thread instantiation
        t.run();                   // Starting of a thread


    }

}
