
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class UserInterface {
    private Scanner scan;
    private TodoList toDo;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.scan = scan;
        this.toDo = list;
        
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add: ");
                String add = scan.nextLine();
                toDo.add(add);
                continue;
            }
            
            if (command.equals("list")) {
                toDo.print();
                continue;
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int remove = Integer.valueOf(scan.nextLine());
                toDo.remove(remove);
                continue;
            }
            
            System.out.println("Unknow Command");
        }
    }
    
}
