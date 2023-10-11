
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int start = 0;
        int end = number;
        while (start < end) {
            System.out.print("*");
            start ++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int start = 0;
        int end = number;
        while (start < end) {
            System.out.print(" ");
            start ++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int start = 1;
        int end = size;
        while (start <= end) {
            int space = size - start;
            int star = size - space;
            printSpaces(space);
            printStars(star);
            start ++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int start = 1;
        int lon = height;
        while (start <= height) {
            if (height < 3) {
                break;
            } else {
                int space = height - start;
                int star = lon - space;
            
                printSpaces(space);
                printStars(star);
                start ++;
                lon ++;
            }
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
