
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        String returnLongest = "";
        for (String element: elements) {
            if (returnLongest.length() < element.length()) {                
               returnLongest = element;
            }            
        }
        return returnLongest;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

}
