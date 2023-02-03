package GetClassMethod;
import java.lang.reflect.*;
public class Demo {
    public static void main(String[] args) {
        int count=0;
        Object o = new String("durga");
        Class c = o.getClass();
        System.out.println("Fully Qualified name of class:"+c.getName());
        Method [] m = c.getDeclaredMethods();
        System.out.println("Method information:");
        for (Method m1 : m)
        {
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The number of methods:"+count);
    }
}
