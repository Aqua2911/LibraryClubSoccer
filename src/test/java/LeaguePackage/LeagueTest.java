package LeaguePackage;

import org.junit.jupiter.api.Test;

import java.util.Date;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class LeagueTest {
    List<Club> clubs = new ArrayList<>();

    List<Coach> coaches = new ArrayList<>();
    @Test
    void getPlayersByClubName() {
        ILeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubs(5);

        for(Club c : league.getClubs())
        {
            assertEquals(c.players, league.getPlayersByClubName(c.name));
        }
    }

    @Test
    void getClubByName() {
        ILeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubs(5);

        for (Club c: league.getClubs())
        {
            assertEquals(c,league.getClubByName(c.name));
        }
    }

    @Test
    void getPlayerByName() {
        ILeagueBuilder lb = new LeagueBuilder();
        League league = lb.buildXClubsYPlayers(5, 10);

        for(Club c : league.getClubs())
        {
            for(Player p: c.players)
            {
                assertEquals(p,  league.getPlayerByName(p.firstName, p.lastName));
            }
        }
    }

    @Test
    void mostTitledClub() {
        Club club1 = new Club("barcelone",null,null,null,null,null);
        Club club2 = new Club("PSG",null,null,null,null,null);
        List<Palmares> palmaresList1 = new ArrayList<>();
        List<Palmares> palmaresList2 = new ArrayList<>();
        Palmares palmares1 = new Palmares("test1", new Date());
        Palmares palmares2 = new Palmares("test2", new Date());
        palmaresList1.add(palmares1);
        palmaresList1.add(palmares2);

        palmaresList2.add(palmares1);

        club1.palmares = palmaresList1;
        club2.palmares = palmaresList2;
        League league = new League();
        clubs.add(club2);
        clubs.add(club1);
        league.clubs = this.clubs;
        assertNotNull(this.clubs);
        String result = club1.toString();
        assertEquals(league.mostTitledClub(), result);

    }

    @Test
    void getCoachByName() {
        League league = new League();
        Coach coach1 = new Coach("lastName1", "firstName1", null,14);
        Coach coach2 = new Coach("lastName2", "firstName2", null, 15);

        this.coaches.add(coach1);
        this.coaches.add(coach2);

        league.coaches = this.coaches;

        assertEquals(league.getCoachByName( "firstName1", "lastName1"), coach1);
        assertEquals(league.getCoachByName("lastName3", "firstName3"), null);
    }

    @Test
    void mostTitledCoach() {
        Coach coach1 = new Coach("lastName1", "firstName1", null,14);
        Coach coach2 = new Coach("lastName2", "firstName2", null, 15);
        List<TitleWon> titleWonList1 = new ArrayList<>();
        List<TitleWon> titleWonList2 = new ArrayList<>();
        TitleWon titleWon1 = new TitleWon("test1", new Date());
        TitleWon titleWon2 = new TitleWon("test2", new Date());
        titleWonList1.add(titleWon1);
        titleWonList1.add(titleWon2);

        titleWonList2.add(titleWon1);

        coach1.titlesWon = titleWonList1;
        coach2.titlesWon = titleWonList2;
        League league = new League();
        this.coaches.add(coach2);
        this.coaches.add(coach1);
        league.coaches = this.coaches;
        String result =coach1.toString();
        assertEquals(league.MostTitledCoach(), coach1);
    }

    @Test
    void transactPlayerClub() {
    }

    @Test
    void createClub() {
        Club club = new Club("PSG",null,null,null,null,null);
        assertNotNull(club);
        assertEquals(club.name,"PSG");
        //String result = clubs.add(new Club("PSG", null, null, null, null, null));

       // assertEquals(club.toString(), result);
    }


}