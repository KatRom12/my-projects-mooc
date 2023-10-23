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
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> productStock;
    
    
    public Warehouse(){
        products = new HashMap<>();
        productStock = new HashMap<>();
        
    }
    
    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        productStock.put(product, stock);
        
    }
    
    public int price(String product) {
        Collection<String> thing = products.keySet();
        if (thing.contains(product)) {
            return products.get(product);
        }
        return -99;
    }
    
    public int stock (String product) {
        Collection<String> theThing = productStock.keySet();
        if (theThing.contains(product)) {
            return productStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (stock(product) > 0) {
            int newStock = (productStock.get(product) - 1);
            productStock.put(product, newStock);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> theProducts = products.keySet();
        return theProducts;
    }
}
