
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Give a number");
        int square = Integer.valueOf(read.nextLine());
        System.out.println(square * square);

    }
}
