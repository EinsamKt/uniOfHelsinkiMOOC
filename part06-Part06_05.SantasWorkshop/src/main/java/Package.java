
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
public class Package {
    private ArrayList<Gift>Package; 
    
    public Package() {
        this.Package = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        Package.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Gift p: Package) {
        totalWeight += p.getWeight();
    }
        return totalWeight;
    }
    
}
