
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
    private BirdsCage cage;
    
    public UserInterface(Scanner scan, BirdsCage cage) {
        this.scan = scan;
        this.cage = cage;
    }
    
    public void start() {
        System.out.println("commands:\n"
                + "Add - adds a bird\n"
                + "Observation - adds an observation\n"
                + "All - prints all birds\n"
                + "One - prints one bird\n"
                + "Quit - ends the program\n");
        this.commands();
    }
    
    public void commands() {
        while(true) {
            System.out.println("Enter Command");
            String command = scan.nextLine();
            
            if(command.toLowerCase().equals("quit")) {
                break;
            }
            
            if(command.toLowerCase().equals("add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin");
                String latinName = scan.nextLine();
                cage.addBird(new Bird(name,latinName));
                continue;
            }
            
            if(command.toLowerCase().equals("observation")) {
                System.out.println("Bird");
                String birdName = scan.nextLine();
                
                cage.observation(birdName);
                continue;
                  
                }
            
            if(command.toLowerCase().equals("all")) {
                cage.printAllBirds();
                continue;
            }
            
            if(command.toLowerCase().equals("one")) {
                System.out.println("Bird");
                String birdName = scan.nextLine();
                
                cage.printBird(birdName);
            }
            
            }
        }
        
    }
    

