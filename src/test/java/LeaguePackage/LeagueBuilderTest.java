package LeaguePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeagueBuilderTest {

    @Test
    void buildXClubs() {
        ILeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubs(0);
        assertEquals(0,league.getClubs().size());

        League league1 = lb.buildXClubs(3);
        assertEquals(3, league1.getClubs().size());

        League league2 = lb.buildXClubs(-1);
        assertEquals(0, league2.getClubs().size());
    }

    @Test
    void buildXClubsYPlayers() {
        ILeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubsYPlayers(3,4);
        assertEquals(4,league.getClubs().get(0).players.size());

        League league1 = lb.buildXClubsYPlayers(3,0);
        assertEquals(0,league1.getClubs().get(0).players.size());

        League league2 = lb.buildXClubsYPlayers(3,-4);
        assertEquals(0,league2.getClubs().get(0).players.size());
    }

    @Test
    void buildXClubsYPlayersZCoach() {
        ILeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubsYPlayersZCoach(3,4,5);
        for(Club c : league.getClubs())
        {
            assertEquals(5, c.coaches.size());
        }

        League league1 = lb.buildXClubsYPlayersZCoach(3,4,0);
        for(Club c : league1.getClubs())
        {
            assertEquals(0, c.coaches.size());
        }

        League league2 = lb.buildXClubsYPlayersZCoach(3,4,-3);
        for(Club c : league2.getClubs())
        {
            assertEquals(0, c.coaches.size());
        }
    }

    @Test
    void buildXClubsRangePlayersRangeCoach() {
        ILeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubsRangePlayersRangeCoach(3,4,9,3,5);

        for(Club c : league.getClubs())
        {
            assertTrue(c.players.size() >= 4 &&
                c.players.size() <= 9);

            assertTrue(c.coaches.size() >= 3 &&
                    c.coaches.size() <= 5);
        }

        League league1 = lb.buildXClubsRangePlayersRangeCoach(3,-5,5,-5,5);

        for(Club c : league1.getClubs())
        {
            assertTrue(c.players.size() >= 0 &&
                    c.players.size() <= 5);

            assertTrue(c.coaches.size() >= 0 &&
                    c.coaches.size() <= 5);
        }

        //League league2 = lb.buildXClubsRangePlayersRangeCoach(3,10,5,10,5);

        //for(Club c : league2.getClubs())
        //{
        //    assertTrue(c.players.size() >= 5 &&
        //            c.players.size() <= 10);

        //    assertTrue(c.coaches.size() >= 5 &&
        //            c.coaches.size() <= 10);
        //}
    }
}