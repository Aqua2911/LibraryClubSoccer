import LeaguePackage.League;
import LeaguePackage.LeagueBuilder;
import LeaguePackage.Match;

import java.util.Date;
/**
 *  Main  is the master class entity we'll be using to build league game
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName  nbClub, nbPlayers
 *  @return league season , ClubName, nbClub, nbPlayers
 *  @author Alpha, Kokou and  Nicolas ,
 */


public class Main {
    public static void main(String[] args) {
        LeagueBuilder leagueBuilder = new LeagueBuilder();
        League league = leagueBuilder.buildXClubsYPlayers(10, 20);
        System.out.println(Match.season(league));
        System.out.println(league);
    }
}
