
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
public class Recipes {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipes(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    
    public void add(String ingredients) {
        this.ingredients.add(ingredients);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
     return this.time;   
    }
    
    public void printIngredients() {
        for (String ingredient: this.ingredients) {
            System.out.println(ingredient);
        }
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public void printAll() {
        for (String recipe: this.ingredients) {
            System.out.println(recipe);
        }
    }
    
    @Override
    public String toString() {
        return this.getName() + ", cooking time: " + this.getTime();
    }
    
}
