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

public class Suitcase {
    private ArrayList<Item> list;
    private int maximumWeight;
    private int weight;
    
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.list = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int thing = item.getWeight();
        if ((thing + weight) <= maximumWeight) {
           list.add(item);
           weight = weight + thing;
        }    
    }
    
    public void printItems() {
        String print = "";
        for (Item thing: list) {
            print = print + "\n" + thing.toString();
        }
        System.out.println(print);
    }
    
    public int totalWeight() {
        return weight;
    }
    
    public Item heaviestItem() {
        if (list.isEmpty()) {
            return null;
        }
        Item haviest = list.get(0);
        for (Item it: list) {
            if (it.getWeight() > haviest.getWeight()) {
                haviest = it;
            }
        }
        return haviest;
    }
    
    
    public String toString() {
        if (list.isEmpty()) {
            return "no items (0 kg)";
        }
        if (list.size() == 1) {
            return "1 item (" + weight + " kg)";
        }
        return list.size() + " items (" + weight + " kg)";
    }
    
}
