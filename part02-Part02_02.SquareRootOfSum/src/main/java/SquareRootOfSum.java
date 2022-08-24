
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give Second number");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = (first + second);
        double sRoot = Math.sqrt(sum);
        System.out.println(sRoot);

    }
}
