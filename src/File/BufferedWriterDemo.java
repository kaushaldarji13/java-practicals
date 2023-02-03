package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char [] ch1 = {'k','a','u','s','h','a','l'};
        bw.write(ch1);
        bw.newLine();
        bw.write("android");
        bw.newLine();
        bw.write("developer");
        bw.flush();
        bw.close();

    }
}
