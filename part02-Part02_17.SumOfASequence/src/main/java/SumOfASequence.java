
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int result = 0;
        last++;
        for (int c=0; c!=last; c++){
            result += c;
            
        }
        System.out.println("The sum is " + result);

    }
}
