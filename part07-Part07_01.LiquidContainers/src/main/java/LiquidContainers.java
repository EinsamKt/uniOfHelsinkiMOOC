

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            //System.out.print("> ");
            System.out.println("First: "+ first + "/100");
            System.out.println("Second: "+ second + "/100");

            String input = scan.nextLine();
            String[]parts = input.split(" ");
            String command = parts[0];
            if (input.equals("quit")) {
                break;
            }
            if (!(command.equals("add") || command.equals("move") || command.equals("remove") || command.equals("add"))) {
                break;
            }
            
            
            
            
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && amount > 0) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            }
            
            if (command.equals("move") && amount > 0) {
                if (first - amount <=0 ) {
                    second += first;
                    first = 0;
                } else {
                    second += amount;
                    first -= amount;
                }
                
                if (second > 100) {
                    second = 100;
                }
            }
            
            if (command.equals("remove") && amount > 0) {
                if (second - amount < 0) {
                    second = 0;
                } else {
                    second -= amount;
                }
            
            }

        }
    }

}
