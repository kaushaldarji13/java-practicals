package File;
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        char[] ch = new char[(int)f.length()];
        fr.read(ch);
        for (char ch2: ch)
        {
            System.out.print(ch2);
        }

        System.out.println("**********************************");

        FileReader fr1 = new FileReader("abc.txt");
        int i= fr1.read();
        while (i != -1){
            System.out.print((char)i );
            i= fr1.read();
        }

    }
}
