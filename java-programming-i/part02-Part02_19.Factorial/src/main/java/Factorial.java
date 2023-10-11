
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int result = 1;
        while (i <= number) {
            if (i == 0) {
                System.out.println("Factorial: 1");
            } else {
                result = result * i;
                i++; 
            }
        }
        System.out.println("Factorial: " + result);
    }
}
