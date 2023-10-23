/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Marek Romanowski
 */
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class SaveableDictionary {
        private HashMap<String, String> dictionaryOne;
        private HashMap<String, String> dictionaryTwo;
        private String file;
    
    public SaveableDictionary(){
        dictionaryOne = new HashMap<>();
        dictionaryTwo = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this();
        this.file = file;
    }
    
    public void add(String word, String translation){
        dictionaryOne.putIfAbsent(word, translation);
        dictionaryTwo.putIfAbsent(translation, word);
    }
    
    public String translate(String word){
        if (dictionaryOne.containsKey(word)) {
            return dictionaryOne.get(word);    
        }
        if (dictionaryTwo.containsKey(word)){
            return dictionaryTwo.get(word);
        }
        return null;
    }
    
    public void delete(String word){
        
        
        if (dictionaryOne.containsKey(word)){
            String translation = dictionaryOne.get(word);
            dictionaryOne.remove(word);
            dictionaryTwo.remove(translation);
            
        }
        if (dictionaryTwo.containsKey(word)){
            String translation = dictionaryTwo.get(word);
            dictionaryTwo.remove(word);
            dictionaryOne.remove(translation);
        }
    }
    
    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(this.file))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String[] parts = row.split(":");
                dictionaryOne.put(parts[0], parts[1]);
                dictionaryTwo.put(parts[1], parts[0]);
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public boolean save() {
        try(PrintWriter writer = new PrintWriter(this.file)){
            for (String word: dictionaryOne.keySet()){
                writer.println(word + ":" + dictionaryOne.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e){
            return false;
        }
        
    }
}
