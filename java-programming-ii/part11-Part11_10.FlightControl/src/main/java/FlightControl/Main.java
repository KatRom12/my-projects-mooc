package FlightControl;
import FlightControl.UI.TextUI;
import FlightControl.logic.FlightControl;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner input = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUI textUI = new TextUI(flightControl, input);
        textUI.start();

    }
}
