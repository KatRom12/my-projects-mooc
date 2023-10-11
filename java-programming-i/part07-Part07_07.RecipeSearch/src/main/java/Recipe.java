/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }
    public boolean searchIngredient(String ingredient) {
        if (ingredients.contains(ingredient)) {
            return true;
        } else {
            return false;
        }
        
    }
}
