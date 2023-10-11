
import java.io.File;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        RecipeManager manager = new RecipeManager();
        manager.getRecipe(file);
        
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while(true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes: " );
                manager.listOfRecipes();   
                System.out.println("");
            }
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes");
                manager.findRecipe(word);
                System.out.println("");
            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                manager.findCookingTime(maxTime);
                System.out.println("");
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                manager.searchForIngredient(ingredient);
                System.out.println("");
            }
        }
     
    }

}
