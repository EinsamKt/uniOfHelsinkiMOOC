
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String>commandsIndex = new ArrayList<>();
        commandsIndex.add("add");
        commandsIndex.add("move");
        commandsIndex.add("remove");
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[]parts = input.split(" ");
            String command = parts[0];
            
            if (input.equals("quit")) {                
                break;
            }
           if ((!(commandsIndex.contains(parts[0]))) || parts.length < 2) {
               System.out.println("Invalid Command");
               continue;
           }
            
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals(commandsIndex.get(0))) {//Add Amount
               first.add(amount);
            }
            
            if (command.equals(commandsIndex.get(1))) {//Move amount from First container to Second container
                if (first.contains() - amount <= 0) {
                    second.add(first.contains());
                    first.remove(amount);                
            } else {
                first.remove(amount);
                second.add(amount);
            } 
            }
            
            if (command.equals("remove") && amount > 0) {//Remove ammount from Second container
                second.remove(amount);
            }
        }

    }

}
