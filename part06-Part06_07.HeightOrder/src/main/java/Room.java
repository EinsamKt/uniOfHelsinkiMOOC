
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
public class Room {
    private ArrayList<Person>personInputs;
    
    public Room() {
    this.personInputs = new ArrayList<>();    
    }
    
    public void add(Person person) {
        personInputs.add(person);
        
    }
    
    public boolean isEmpty() {
        return personInputs.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        if (personInputs.isEmpty()) {
            return null;
        }
        
        return personInputs;
    }
    
    public Person shortest() {
        if (personInputs.isEmpty()) {
            return null;
        }
        
        Person returnPerson = personInputs.get(0);
        
        for (Person personInput: personInputs) {
            if (returnPerson.getHeight() > personInput.getHeight()) {
                returnPerson = personInput;
            }
        }
        
        return returnPerson;
        
    }
    
    public Person take() {
        if (personInputs.isEmpty()) {
            return null;
        }
        
        Person smallest = this.shortest();
        
        personInputs.remove(smallest);
        
        return smallest;
        
        
    }
    
}
