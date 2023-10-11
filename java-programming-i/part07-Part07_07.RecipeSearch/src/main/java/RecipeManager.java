/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    private ArrayList<Recipe> recipesList;
    private ArrayList<String> ingredients;
    
    public RecipeManager () {
        this.recipesList = new ArrayList<>();
        this.ingredients = new ArrayList<>();
    }
    
    public void getRecipe (String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                int time = Integer.valueOf(scan.nextLine());
                Recipe recipe = new Recipe (name, time);
                recipesList.add(recipe);
                while ((scan.hasNextLine())) {
                    String ingredient = scan.nextLine();
                    if (ingredient.equals("")) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }   
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());   
        }
    }
    
    public void listOfRecipes () {
        for (int i = 0; i < recipesList.size(); i ++) {
            System.out.println(recipesList.get(i).toString());
        }
    }
    
    public void findRecipe (String word) {
        for (Recipe recipe: recipesList) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe.toString());
            }
        }
    }
    
    public void findCookingTime (int maxTime) {
        for (Recipe recipe: recipesList) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe.toString());
            }
        }
    }
    
    public void searchForIngredient(String ingredient) {
        for (Recipe recipe: recipesList) {
            if (recipe.searchIngredient(ingredient)) {
                System.out.println(recipe.toString());
            }
        }
    }
}
