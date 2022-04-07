package LeaguePackage;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class LeagueBuilder implements ILeagueBuilder {

    Fairy fairy = Fairy.create();

    @Override
    public League buildXClubs(int nbClub) {
        return buildXClubsYCoach(nbClub, 1);
    }

    @Override
    public League buildXClubsYPlayers(int nbClub, int nbPlayers) {
        return buildXClubsYPlayersZCoach(nbClub, nbPlayers, 1);
    }

    @Override
    public League buildXClubsYPlayersZCoach(int nbClub, int nbPlayers, int nbCoach) {
        League newLeague = new League();

        Person placeholder;
        Random rng = new Random();
        for(int i = 0; i < nbClub; i++){
            placeholder = fairy.person();
            String city = placeholder.getAddress().getCity();
            String name = city + "FC";
            String address = placeholder.getAddress().getAddressLine1();
            Club newClub = new Club(name, "", "", new Date(), city, address);

            for(int j = 0; j < nbPlayers; j++){
                placeholder = fairy.person();
                float height = rng.nextFloat(5, 7);
                float weight = rng.nextFloat(100, 200);
                float stats = rng.nextFloat(0, 10);
                Player newPlayer = new Player(placeholder.getLastName(), placeholder.getFirstName(), height, weight,placeholder.getAddress().getCity(), stats);

                newClub.players.add(newPlayer);
            }

            for(int k = 0; k < nbCoach; k++){
                placeholder = fairy.person();
                float statsMod = rng.nextFloat(0.5f, 2);
                Coach newCoach = new Coach(placeholder.getLastName(), placeholder.getFirstName(), "N/A",statsMod);

                newClub.coaches.add(newCoach);
            }

            newLeague.getClubs().add(newClub);
        }

        return newLeague;
    }

    @Override
    public League buildXClubsRangeCoachRangePlayers(int nbClub, int minCoach, int maxCoach, int minPlayer, int maxPlayer) {
        return null;
    }
}
