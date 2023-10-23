
import java.util.HashMap;
import java.util.ArrayList;

public class Program {
    ArrayList<String> keys = new ArrayList<>();
    
    
    public static void printKeys(HashMap<String,String> hashmap) {
        for(String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap,String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }  
        }    
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text){
        for (String keys: hashmap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(hashmap.get(keys));
            }
        }
    }
    
    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

}
