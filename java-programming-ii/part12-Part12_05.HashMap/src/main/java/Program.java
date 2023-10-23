
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <String, Integer> numbAndLet = new HashMap<>();
        // You can test the class here
        
       
      
        numbAndLet.add("one", 1);
        numbAndLet.add("two", 2);
        System.out.println(numbAndLet.get("one"));
        //numbAndLet.remove("one");
        System.out.println(numbAndLet.get("two"));
        


    }

}
