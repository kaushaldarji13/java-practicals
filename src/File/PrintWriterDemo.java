package File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("abc12.txt");
        PrintWriter out = new PrintWriter(fw);
        out.write(100);
        out.println (100);
        out.println(true);
        out.println('c');
        out.println("kaushal");
        out.flush();
        out.close();
    }
}
