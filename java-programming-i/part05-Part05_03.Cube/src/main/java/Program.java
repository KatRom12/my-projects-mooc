
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube kasia = new Cube(4);
        System.out.println(kasia.volume());
        System.out.println(kasia);
        
        System.out.println();
        
        Cube klara = new Cube(15);
        System.out.println(klara.volume());
        System.out.println(klara);
    }
}
