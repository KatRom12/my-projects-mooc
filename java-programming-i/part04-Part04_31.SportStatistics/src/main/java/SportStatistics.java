
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int game = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner teams = new Scanner(Paths.get(file))) {
            while (teams.hasNextLine()) {
                String data = teams.nextLine();
                String[] datas = data.split(",");
                String teem = datas[0];
                String rival = datas [1];
                int teemScore = Integer.valueOf(datas[2]);
                int rivalScore = Integer.valueOf(datas[3]);
                
                if (team.equals(teem)) {
                    game ++;
                    if (teemScore > rivalScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (team.equals(rival)) {
                    game++;
                    if (teemScore > rivalScore) {
                        losses++;
                    } else {
                        wins++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        System.out.println("Games: " + game);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
