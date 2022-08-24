import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Test your Film class here

         Film djangoUnchained = new Film("Django Unchained", 16);

         Scanner reader = new Scanner(System.in);

        System.out.println("How old are you");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= djangoUnchained.ageRating()) {
             System.out.println("You may watch the film " + djangoUnchained.name());
         } else {
             System.out.println("You may not watch the film " + djangoUnchained.name());
         }
    }
}
