
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team");
        String team = scan.nextLine();
        
        try (Scanner read = new Scanner(Paths.get(file))) {
            int count = 0;
            int wins = 0;
            while(read.hasNextLine()) {
                String row = read.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);                
                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    count++;
                }
                if (homeTeam.equals(team) && homePoints > visitingPoints) {
                    wins++;
                }
                if (visitingTeam.equals(team) && visitingPoints > homePoints) {
                    wins++;
                }
                
            }
            int losses = count - wins;
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("File " + file + " not found.");
        }

    }

}
