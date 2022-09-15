
import java.util.ArrayList;
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

    private int input;
    private Scanner scan;
    private final Grading grades;
    
    public UserInterface(Scanner scan, Grading grades) {
        this.grades = grades;
        this.scan = scan;
        
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
            
            input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            }
            
            if ((input >=0) && (input <= 100)) {
                grades.add(input);
            }
            
        }
        
    }
    

    
}
