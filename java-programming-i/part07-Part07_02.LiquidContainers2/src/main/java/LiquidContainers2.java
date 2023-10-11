
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            
            System.out.println("First: " + containerOne.toString());
            System.out.println("Second: " + containerTwo.toString());
            String input = scan.nextLine();
            
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                containerOne.add(amount);     
            }
            if (command.equals("move")) {
                if (containerOne.contains() - amount >= 0) {
                    containerOne.remove(amount);
                    containerTwo.add(amount);
                } else {   
                    int removing = containerOne.contains();
                    containerTwo.add(removing);
                    containerOne.remove(amount);
                }    
                
                
                /*if (containerOne.contains() > 0) {
                        if (first - amount >= 0) {
                            first = first - amount;
                            if (second + amount <= 100) {
                            second = second + amount;
                            } else {
                                second = 100;
                            }
                        } else {
                            if (second + first <= 100) {
                            second = second + first;
                            } else {
                                second = 100;
                            }
                            first = 0;
                            
                        } */   
            }
            if (command.equals("remove")) {
                containerTwo.remove(amount);
            }

        }
    }

}
