
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println ("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            
            String input = scan.nextLine();
            System.out.println("");
            String[] part = input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if (part[0].equals("add")) {
                int addition = Integer.valueOf(part[1]);
                first.add(addition);
            } else if (part[0].equals("move")) {
                int moving = Integer.valueOf(part[1]);
                if (moving < 0) {
                    continue;
                } else if (first.contains() == 0) {
                    continue;
                } else if (first.contains() - moving < 0) {
                    int firstContain = first.contains();
                    second.add(firstContain); 
                    first.remove(moving);
                } else {
                    first.remove(moving);
                    second.add(moving);
                }
            } else if (part[0].equals("remove")) {
                int remove = Integer.valueOf(part[1]);
                second.remove(remove);
            }

        }
    }    
}
