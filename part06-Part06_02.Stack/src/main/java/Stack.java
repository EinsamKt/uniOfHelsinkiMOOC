
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
public class Stack {
    private ArrayList<String>Stack;
    
    public Stack() {
        this.Stack = new ArrayList<>();
    }
    public void add(String value) {
        if (!(this.Stack.contains(value))) {
            this.Stack.add(value);
        }
        
    }
    public ArrayList<String> values() {
        return this.Stack;
        }
    public String take() {
        String take = this.Stack.get(this.Stack.size()-1);
        if (this.Stack.size() > 0 ) {
            this.Stack.remove(this.Stack.size()-1);
        }
        return take;
    }
    
    
    public boolean isEmpty() {
        return this.Stack.isEmpty();
    }
    
}
