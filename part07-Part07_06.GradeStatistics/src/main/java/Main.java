
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Grading manager = new Grading();
        UserInterface ui = new UserInterface(scanner, manager);
        ui.start();
        System.out.println(manager);

        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
