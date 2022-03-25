package LeaguePackage;

import org.junit.jupiter.api.Test;

import java.util.Date;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class LeagueTest {

    @Test
    void getPlayersByClubName() {
        League league = new League();
        league.CreateClub("name", "history", "color", new Date(), "city", "address");
        //league.CreateClub("name2", "history", "color", new Date(), "city", "address");
        //league.CreateCoach("Tremblay", "Mario", "Montréal", 1.2f);
        //.CreatePlayer("lastNameTest", "firstNameTest", 5.8f, 147, "city", 2);
        //league.TransactPlayerClub("firstNameTest", "lastNameTest", "name");


        assertEquals(1, league.getPlayersByClubName("name").size());
    }

    @Test
    void getClubByName() {
    }

    @Test
    void getPlayerByName() {
    }

    @Test
    void mostTitledClub() {
    }

    @Test
    void match() {
    }

    @Test
    void mostTitledCoach() {
    }
}