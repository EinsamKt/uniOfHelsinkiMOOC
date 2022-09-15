
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class BirdsCage {
    private ArrayList<Bird>allBirds;
    
    public BirdsCage() {
        this.allBirds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.allBirds.add(bird);
    }
    
    public void printBird(String name) {
        int count = 0;
        for (Bird bird: allBirds) {
            if (bird.getName().toLowerCase().contains(name.toLowerCase()) || bird.getLatinName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(bird);
                count++;
            }
            
            if (count == 0) {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public void printAllBirds() {
        for (Bird bird: allBirds) {
            System.out.println(bird);
        }
    }
    
    public ArrayList<Bird> searchBirds() {
        return this.allBirds;
    }
    
    public void observation(String name) {
        int count = 0;
        for (Bird bird: allBirds) {
            
            if (bird.getName().toLowerCase().contains(name.toLowerCase()) || bird.getLatinName().toLowerCase().contains(name.toLowerCase())) {
                bird.addObservation();
                count++;    
            }
            
        }
        if (count == 0) {
            System.out.println("Not a bird!");
        }
    }
    
}
