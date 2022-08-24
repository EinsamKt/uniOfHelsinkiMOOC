import java.util.Scanner;

public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            count++;
        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int count = 0;
        while (count < size) {
            printSpaces((size - 1) - count);
            count++;
            printStars(count);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int count = 0;
        int test = 1;        
        while (count < height) {
            printSpaces((height - 1)  - count);
            count++;
            printStars (test);
            test = test + 2;
        }
        printSpaces((test-4)/2);
        printStars(3);
        printSpaces((test-4)/2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tamanho da sua arvore?");
        int input = Integer.valueOf(scan.nextLine());
       /* printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---"); */
        christmasTree(input);
    }
}
