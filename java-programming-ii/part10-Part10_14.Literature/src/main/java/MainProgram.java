
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, age));
        }
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);
        Collections.sort(books, comparator);
        
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        for (Book book: books) {
            System.out.println(book);
        }    
        //books.stream().sorted((p1, p2) -> {
         //   return Integer.valueOf(p1.getAge()).compareTo(Integer.valueOf(p2.getAge()));
          //      }).forEach(p -> System.out.println(p.toString()));
        
    }

}
