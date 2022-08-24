
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String longestName = "";
        double sum = 0;
        double count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
            break;
        }
            String[] pieces = input.split(",");
            sum = sum + Integer.valueOf(pieces[1]);
            count++;
            if (length < pieces[0].length()) {
                length = pieces[0].length();
                longestName = pieces[0];
            }
        }
        double avg = sum/count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);


    }
}
