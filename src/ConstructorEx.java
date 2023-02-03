
public class ConstructorEx {
    static int count = 0;
    {
        count++;
    }
    public ConstructorEx(){
    }
   private ConstructorEx(int i){

    }
    protected ConstructorEx(double d){

    }

    public static void main(String[] args) {
        ConstructorEx c1 = new ConstructorEx();
        ConstructorEx c2 = new ConstructorEx(10);
        ConstructorEx c3 = new ConstructorEx(10.5);
        System.out.println("The no of object created:-" +count);

    }
}
