
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        int input = Integer.valueOf(scanner.nextLine());        
        for (int i=0; i<list.size();i++){            
            if (input == list.get(i)) {
                int test = i;
                System.out.println(input + " is at index " + test);   
            }
        }
          

        // implement here finding the indices of a number
    }
}