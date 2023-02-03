package CustomizedException;
import java.io.*;
public class TryWithResources {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt")
        )){
//            br = new BufferedReader(new FileReader("Output.txt") {
//            });
        }
    }
}
