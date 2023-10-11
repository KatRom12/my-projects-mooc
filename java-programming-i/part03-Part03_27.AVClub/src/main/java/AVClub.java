
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String text = scanner.nextLine();
            if ("".equals(text)) {
                break;
            } else {
                String[] gap = text.split(" ");
                for (int i = 0; i < gap.length; i++)
                    if (gap[i].contains("av")) {
                        System.out.println(gap[i]);
                    }
            }
        }


    }
}
