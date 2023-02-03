public class SingletonClass {
    private static SingletonClass t = new SingletonClass();
    private SingletonClass()
    {

    }
    public static SingletonClass getObj(){
        return t;
    }

    public static void main(String[] args) {
        System.out.println("Singleton class");
    }
}
