
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList things = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(identifier, name);
            if (!(things.contains(item))) {
                things.add(item);
            } 
            
        }
        
        System.out.println("==Items==");
        for (int i = 0; i < things.size(); i++) {
            System.out.println(things.get(i));     
        }
        


    }
}
