
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
public class TodoList {
    private ArrayList<String>toDoList;
    
    public TodoList() {
        this.toDoList = new ArrayList<>();
    }
    
    public void add(String task) {
        toDoList.add(task);
    }
    
    public void print() {
        int index = 0;
        
        for (String task: toDoList) {
            index++;
            System.out.println(index + ": " + task);
        }
    }
    
    public void remove(int number) {
        if (number <= toDoList.size()) {
            toDoList.remove(number-1);
        } else {
            System.out.println("Invalid number");
        }
        
    }
    
}
