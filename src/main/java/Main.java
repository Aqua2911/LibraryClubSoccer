import LeaguePackage.League;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        League league = new League();
        league.CreateClub("name", "history", "color", new Date(), "city", "address");
        league.CreateClub("name2", "history", "color", new Date(), "city", "address");
        league.CreateCoach("Tremblay", "Mario", "Montréal");
        System.out.println(league);
    }
}
