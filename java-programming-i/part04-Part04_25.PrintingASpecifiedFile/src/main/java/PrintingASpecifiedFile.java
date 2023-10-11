
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        
        String file = scanner.nextLine();
        
        try (Scanner second = new Scanner(Paths.get(file))) {
           
            if (file.equals(file)) {
                while (second.hasNextLine()) {
                    String row = second.nextLine();
                    System.out.println(row);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
