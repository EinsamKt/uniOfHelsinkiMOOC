
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
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase>suitcases;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = suitcase.totalWeight();
        
        for (Suitcase s: suitcases) {
            weight += s.totalWeight();
        }
        
        if (weight  <= this.maximumWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase s: suitcases) {
            s.printItems();
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        
        for (Suitcase s: suitcases) {
            totalWeight += s.totalWeight();
        }
        
        String noItems = "no suitcases" + " (" + totalWeight + " kg)"; 
        String oneItem = this.suitcases.size() + " suitcase" + " (" + totalWeight + " kg)"; 
        String moreItems = this.suitcases.size() + " suitcases" + " (" + totalWeight + " kg)";       
                
        if (this.suitcases.size() == 1) {
            return oneItem;
        }
        
        if (this.suitcases.size() == 0) {
            return noItems;
        }
        
        return moreItems;
    }
    
}
