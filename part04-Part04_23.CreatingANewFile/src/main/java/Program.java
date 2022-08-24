import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class Program {

    public static void main(String[] args) throws IOException {
        // you don't need to do anything here...
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
            
        }
    }
}
