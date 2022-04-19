package LeaguePackage;

import java.util.*;

/**
 * Match  is the class entity we'll be using to create game
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName  HomeClub_Name, VisitorClub_Name, results of the game
 *  @return HomeClub_Name, VisitorClub_Name, resultHome_Club, resulVisitor_Club
 *  @author Alpha, Kokou and  Nicolas ,
 */


public class Match {

    public static Club play(Club home, Club visitor){
        Random rng = new Random();
        float resultHome = rng.nextInt(5) * home.getStats() * 1.5f;
        float resultVisitor = rng.nextInt(5) * visitor.getStats();
        if(resultHome >= resultVisitor){
            return home;
        }
        else{
            return visitor;
        }
    }

    /**
     * play is the class entity we'll be using to generate statistics game
     *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
     *  user@baeldung:~$ mvn javadoc:javadoc
     *  @DisplayName  HomeClub_Name, VisitorClub_Name, results of the game
     *  @return scoreboard
     *  @author Alpha, Kokou and  Nicolas ,
     */

    public static String play(League league, String clubNameHome, String clubNameVisitor){
        Club home = league.getClubByName(clubNameHome);
        Club visitor = league.getClubByName(clubNameVisitor);
        Random rng = new Random();
        float resultHome = rng.nextInt(5) * home.getStats() * 1.5f;
        float resultVisitor = rng.nextInt(5) * visitor.getStats();
        if(resultHome >= resultVisitor){
            return home.toString();
        }
        else{
            return visitor.toString();
        }
    }

    public static HashMap<Club, Integer> season(League league){
        HashMap<Club, Integer> scoreboard = new HashMap<>();
        for(Club club : league.getClubs()) {
            scoreboard.put(club, 0);
        }

        for(Club home : scoreboard.keySet()){
            for(Club visitor : scoreboard.keySet()){
                if(home != visitor){
                    if(play(home, visitor) == home){
                        scoreboard.put(home, scoreboard.get(home)+1);
                    }
                    else{
                        scoreboard.put(visitor, scoreboard.get(visitor)+1);
                    }
                }
            }
        }

        return scoreboard;
    }

}
