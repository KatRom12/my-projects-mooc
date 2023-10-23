
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println ("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            System.out.println("");
            String[] part = input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if (part[0].equals("add")) {
                int add = Integer.valueOf(part[1]);
                if (add < 0) {
                    continue;
                }
                if (first + add <= 100) {
                    first += add;
                } else {
                    first = 100;
                }
            } else if (part[0].equals("move")) {
                int moving = Integer.valueOf(part[1]);
                if (first == 0) {
                    continue;
                } else if (first - moving < 0) {
                    second = first;
                    first = 0;
                } else {
                    first -= moving;
                    if (second + moving <= 100) {
                        second += moving;
                    } else {
                        second = 100;
                    }
                }
            } else if (part[0].equals("remove")) {
                int remove = Integer.valueOf(part[1]);
                if (second == 0) {
                    continue;
                } else if (second - remove < 0) {
                    second = 0;
                } else {
                    second -= remove;
                }
            }

        }
    }

}
