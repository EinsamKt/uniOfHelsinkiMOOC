

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws IOException {
        try (Scanner read = new Scanner(Paths.get("data.txt"))) {
            while (read.hasNextLine()) {
                String row = read.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
