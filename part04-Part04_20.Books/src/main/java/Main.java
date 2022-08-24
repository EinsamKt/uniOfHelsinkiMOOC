import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();
        while(true) {
            System.out.println("Title: ");
            String name = read.nextLine();
            if (name.equals("")) {
                break;
            } else {
                System.out.println("Pages: ");
                int pages = Integer.valueOf(read.nextLine());
                System.out.println("Publication year: ");
                int year = Integer.valueOf(read.nextLine());
                books.add(new Books(name, pages, year));
            }
        }
        System.out.println("What information will be printed?");
        String input = read.nextLine();
        for (Books book: books) {
            if (input.equals("name")) {
                System.out.println(book.getName());
            }
            if (input.equals("everything")) {
                System.out.println(book);
            } 
        }
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
