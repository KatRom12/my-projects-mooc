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
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokeManager;
    
    public JokeManager() {
        this.jokeManager = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokeManager.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokeManager.isEmpty()) {
            String empty = "Jokes are in short supply.";
            return empty;
        } else {
            Random draw = new Random();
            int i = draw.nextInt(jokeManager.size());
            String random = this.jokeManager.get(i); 
            return random;
        }
    }
    
    public void printJokes() {
        for (int i = 0; i < this.jokeManager.size(); i ++) {
            String joke = this.jokeManager.get(i);
            System.out.println(joke);
        }
    }
}
