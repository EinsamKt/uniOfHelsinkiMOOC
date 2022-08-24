
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        number++;
        for(int c=1; c!=number; c++){
            factorial *= c;
        }
        System.out.println("Factorial: " + factorial);

    }
}
