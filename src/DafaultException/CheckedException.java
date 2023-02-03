package DafaultException;
import java.io.*;
public class CheckedException {
    public static void main(String[] args)throws FileNotFoundException  {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello");
        System.out.println(10/0);
    }
}
