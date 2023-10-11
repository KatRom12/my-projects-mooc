
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            } else {
                String[] gap = text.split(" ");
                int last = gap.length - 1;
                System.out.println(gap[last]);
            }
        }


    }
}
