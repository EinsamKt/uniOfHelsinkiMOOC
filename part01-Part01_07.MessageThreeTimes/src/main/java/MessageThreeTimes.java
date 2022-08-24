// Introduce the scanner tool used for reading user input
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner test = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("Write a message: ");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message = test.nextLine();

        // Print the message written by the user
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}