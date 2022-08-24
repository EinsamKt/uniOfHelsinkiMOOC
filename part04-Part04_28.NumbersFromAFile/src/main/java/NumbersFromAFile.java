
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> fileToList = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        try (Scanner read = new Scanner (Paths.get(file))) {
            while (read.hasNextLine()) {
                fileToList.add(Integer.valueOf(read.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Failed to read the file");
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count =0;
        for (int i = 0; i<fileToList.size(); i++) {
            if (fileToList.get(i)>=lowerBound && fileToList.get(i)<=upperBound) {
                count++;
            }            
        }
        System.out.println("Numbers: " + count);

    }

}
