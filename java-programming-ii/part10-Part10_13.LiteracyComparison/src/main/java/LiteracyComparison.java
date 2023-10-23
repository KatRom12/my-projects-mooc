
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<LiteracyRate> theList = new ArrayList<>();
        
        try {
           Files.lines(Paths.get("literacy.csv"))
                   .forEach(row -> list.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        for(String line: list) {
            String[] pieces = line.split(",");
            String country = pieces[3];
            int year = Integer.valueOf(pieces[4]);
            double rate = Double.valueOf(pieces[5]);
            String[] numbs = pieces[2].split(" ");
            String gender = numbs[1];
            gender.trim();
            theList.add(new LiteracyRate(country, year, gender, rate)); 
        }
        theList.stream().sorted((p1, p2) -> { 
                    return Double.valueOf(p1.getRate()).compareTo(Double.valueOf(p2.getRate()));
                        }).forEach(p -> System.out.println(p.toString()));
                
        
                
                          
                        
        


    }
}
