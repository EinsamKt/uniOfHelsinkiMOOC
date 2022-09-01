
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
public class TextUI {
    private Scanner scan;
    private SimpleDictionary ditctionary;
    
    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.ditctionary = dictionary;
    }
    
    public void start() {
        while(true) {
            
            System.out.println("Command: ");
            
            String command = scan.nextLine();
            String word = "";
            String translation = "";
            String search = "";
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Word:");
                word = scan.nextLine();
                System.out.println("Translation:");
                translation = scan.nextLine();
                this.ditctionary.add(word, translation);
                continue;
                
            }
            
            if (command.equals("search")) {
                System.out.println("To be translated:");
                search = scan.nextLine();
                
                if (this.ditctionary.translate(search) == null) {
                    System.out.println("Word " + search + " was not found");
                    continue;
                }
                
                System.out.println("Translation: " + this.ditctionary.translate(search));
                continue;
                                                
            }
            
            System.out.println("Unknown command");            
            
        }
    }
    
    public boolean command() {
        return false;
    }
    
}
