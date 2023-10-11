
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        int start = 0;
        int end = number;
        while (start < end) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int start = 0;
        int end = size;
        while (start < end) {
            printStars(size);
            start++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int start = 0;
        int end = height;
        while (start < end) {
            printStars(width);
            start++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int start = 0;
        int end = size;
        while (start < end) {
            printStars(start + 1);
            start++;
        }
    }
}
