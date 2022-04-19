package LeaguePackage;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @Test
    void play() {
        //LeagueBuilder lb = new LeagueBuilder();
        //League league = lb.buildXClubs(2);
         //assertEquals();

    }

    @Test
    void testPlay() {
    }

    @Test
    void season() {
        LeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubs(10);
        HashMap<Club, Integer> scoreboard = Match.season(league);
        int nbMatch = 0;
        for (Integer value : scoreboard.values()) {
            nbMatch += value;
        }
        assertEquals(90, nbMatch);

    }
}