/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> products;
   
    public ShoppingCart(){
        products = new HashMap<>();
    }
    public void add(String product, int price) {
        if (products.keySet().contains(product)) {
            products.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            products.put(product, item);
        }    
    }
    
    public int price() {
        int sum = 0;
        for (Item it: products.values()) {
            sum = sum + it.price();
        }
        return sum;
    }
    
    public void print() {
        for (Item it: products.values()){
            System.out.println(it.toString());
        }
    }
}
