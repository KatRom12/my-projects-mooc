
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            
            list.add(number);
        }
        
        int smallest = list.get(0);
        int index = list.size() - 1;
        
        
        for (int i = 0; i <= index; i ++) {
            int numb = list.get(i);
            if (smallest > numb) {
                smallest = numb;
            }
        }
        System.out.println("Smallest number: " + smallest);
           
        for (int in = 0; in <= index; in ++) {
                int numero = list.get(in);
                if (numero == smallest) {
                    System.out.println("Found at index: " + in);
                }
        }
 
    }
}
