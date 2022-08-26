
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString() {
        String colletion = "The collection " + this.name +" has "+ this.elements.size() +" elements:";
        String colletion1 = "The collection " + this.name +" has "+ this.elements.size() +" element:";
        String elements = "";
        for (String element: this.elements) {
            if (this.elements.size() != 1) {
                elements = elements + element + "\n";
            } else {
                elements = element;
            }
        }
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        if (this.elements.size() != 1) {
             return colletion + "\n" + elements;
        }
        return colletion1 + "\n" + elements;
    }
    
}
