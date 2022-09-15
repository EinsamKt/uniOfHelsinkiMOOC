
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
public class RecipesManager {
    private final ArrayList<Recipes> recipes;
    
    public RecipesManager() {
        this.recipes = new ArrayList<>();
    }
    
    public void add(Recipes recipe) {
        this.recipes.add(recipe);
    }
    
    public void printRecipes() {
        for (Recipes recipe: recipes) {
            System.out.println(recipe);
        }
    }
    
    public void searchByName(String name) {
        System.out.println("Recipes:");
        for (Recipes recipe: recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
            
        }
    }
    
    public void searchByTime(int time) {
        System.out.println("Recipes:");
        for (Recipes recipe: recipes) {
            if(recipe.getTime()<=time) {
                System.out.println(recipe);
            }
        }
    }
    
    public void searchByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipes recipe: recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
            
        }
        
    }
    
    public void printAll() {
        for (Recipes recipe: recipes) {
            System.out.println(recipe);
            recipe.printAll();
            System.out.println("");
        }
        
    }
    

    
    

    
    
}
