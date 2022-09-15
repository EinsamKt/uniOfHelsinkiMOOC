

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class UserInterface {
    private final Scanner scan;
    private final RecipesManager recipes;
    private final ArrayList<String>temporary;  
    private Recipes recipe;
    public UserInterface(Scanner scan, RecipesManager recipes) {
        this.scan = scan;        
        this.temporary = new ArrayList<>();
        this.recipes = recipes;

    }
    
    public void start() {
        
        System.out.println("File to read: ");
        String file = scan.nextLine();
        
        try (Scanner read = new Scanner(Paths.get(file))) {
            while(read.hasNextLine()) {
                
                String line = read.nextLine();
                
                if (line.trim().isEmpty() || !read.hasNextLine()) {
                    
                    ArrayList<String> ingredients = new ArrayList<>();
                    
                    String name = this.temporary.get(0);
                    int time = Integer.valueOf(this.temporary.get(1));
                    
                    for (int i=2; i<this.temporary.size(); i++) {
                        ingredients.add(this.temporary.get(i));
                    }
                    
                    recipes.add(new Recipes(name, time, ingredients));
                    
                    this.temporary.clear();
                    

                    
                    
                    
                } else {
                   this.temporary.add(line);                   
                }
           
        }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        
    }
        this.commands();
        
    
    }
    
    public void commands() {
        System.out.println("Commands:\n"
        + "list - lists the recipes\n"
        +"stop - stops the program\n"
        + "find name - searches recipes by name\n"
        + "find cooking time - searches recipes by cooking time\n"
        + "find ingredient - searches recipes by ingredient \n");
        
        while(true) {
            System.out.println("Enter Command:");
            String command = scan.nextLine();
        
             if (command.equals("stop")) {
                break;
            }
             if (command.equals("list")) {
                 System.out.println("Recipes:");
                 recipes.printRecipes();
                 continue;
             }
             if(command.equals("find name")) {
                 System.out.println("Searched word: ");
                 String findName = scan.nextLine();
                 recipes.searchByName(findName);
                 continue;
             }
             if (command.equals("find cooking time")) {
                 System.out.println("Max cooking time: ");
                 int time = Integer.valueOf(scan.nextLine());
                 recipes.searchByTime(time);
             }
             if (command.equals("find ingredient")) {
                 System.out.println("Ingredient: ");
                 String ingredient = scan.nextLine();
                 recipes.searchByIngredient(ingredient);
             } 
        }
    }
}
