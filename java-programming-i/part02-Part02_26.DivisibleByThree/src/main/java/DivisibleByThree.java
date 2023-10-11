
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange (2, 10);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        int numb = 0;
        for (numb = beginning; numb <= end; numb++) {
            if (numb % 3 == 0) {
                System.out.println(numb);
            }
        }
    }

}
