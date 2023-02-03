package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterDemo {
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(100); // adding a single character
        fw.write("kaushal \n Android Developer");
        fw.write('\n');
        char[] ch1 = {'a','b','c'};
        fw.write(ch1);
        fw.write('\n');
        fw.flush();
        fw.close();



    }
}
