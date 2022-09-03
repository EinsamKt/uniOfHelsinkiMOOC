/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Container {
    private int container = 0;

    
    public Container() {
        
    }
    
    public int contains() {
        return this.container;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.container += amount;
        }
        
        if (this.container > 100) {
            this.container = 100;
        }
    }
    
    public void remove(int amount) {
        if (this.container - amount >= 0) {
            this.container -= amount;
        } else {
            this.container = 0;
        }
    }
    
    @Override
    public String toString() {
        return this.container + "/100";
    }
    
    
}
