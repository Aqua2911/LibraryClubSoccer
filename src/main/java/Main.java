import LeaguePackage.League;
import LeaguePackage.LeagueBuilder;
import LeaguePackage.Match;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LeagueBuilder leagueBuilder = new LeagueBuilder();
        League league = leagueBuilder.buildXClubsYPlayers(10, 20);
        System.out.println(Match.season(league));
        //System.out.println(league);
    }
}
