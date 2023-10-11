
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birds.add(bird);
            }
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String observedBird = scan.nextLine();
                for (Bird observed: birds) {
                    if (observed.getName().equals(observedBird)){
                        observed.numberOfObservation();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
              
                
            }
            if (command.equals("All")) {
                for (Bird bird: birds) {
                    System.out.println(bird.toString());
                }
            }
            if (command.equals("One")) {
                System.out.println("Bird?");
                String one = scan.nextLine();
                for (Bird bird: birds) {
                    if(bird.getName().equals(one)) {
                        System.out.println(bird.toString());
                    }
                }
            }
        }

    }

}
