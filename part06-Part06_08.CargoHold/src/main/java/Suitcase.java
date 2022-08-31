
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
public class Suitcase {
    private ArrayList<Item>items;    
    private int maximumWeight;
    
    public Suitcase(int weight) {        
        this.maximumWeight = weight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int weight = item.getWeight();
        for (Item i: items) {
            weight += i.getWeight();
        }
        
        if(weight <= maximumWeight) {
            items.add(item);
        }
            }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item i: items) {
            totalWeight += i.getWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item i: items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }
        
        return heaviest;
        
        
    }
    
    @Override
    public String toString() {
        int totalWeight = 0;
        
        for (Item i: items) {
            totalWeight += i.getWeight();
        }
        
        String noItems = "no items" + " (" + totalWeight + " kg)"; 
        String oneItem = this.items.size() + " item" + " (" + totalWeight + " kg)"; 
        String moreItems = this.items.size() + " items" + " (" + totalWeight + " kg)";       
                
        if (this.items.size() == 1) {
            return oneItem;
        }
        
        if (this.items.size() == 0) {
            return noItems;
        }
        
        return moreItems;
                
    }
    
    
}
