
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int input = Integer.valueOf(scanner.nextLine());
        input = input + 1;
        for (int i = 0; i < input; i++ ) {
            System.out.println(i);
        }

    }
}
