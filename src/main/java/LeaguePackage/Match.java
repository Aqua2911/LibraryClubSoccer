package LeaguePackage;

import java.util.*;

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
