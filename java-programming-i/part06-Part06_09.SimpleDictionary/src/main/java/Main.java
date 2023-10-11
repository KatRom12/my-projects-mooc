
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        

        TextUI t = new TextUI(new Scanner(System.in), new SimpleDictionary());
        t.start();
        
    }
}
