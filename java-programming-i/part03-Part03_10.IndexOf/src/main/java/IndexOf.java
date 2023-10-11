
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int number = Integer.valueOf(scanner.nextLine());
        
        int size = list.size() - 1;
        for (int i = 0; i <= size; i++) {
            int index = list.get(i);
            if (index == number) {
                System.out.println(number + " is at index " + i);
            }
            
        }
    }
}
