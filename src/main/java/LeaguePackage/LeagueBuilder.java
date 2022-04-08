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
        return buildXClubsYPlayers(nbClub, 1);
    }

    @Override
    public League buildXClubsYPlayers(int nbClub, int nbPlayers) {
        return buildXClubsYPlayersZCoach(nbClub, nbPlayers, 1);
    }

    @Override
    public League buildXClubsYPlayersZCoach(int nbClub, int nbPlayers, int nbCoach) {
        League newLeague = new League();

        for(int i = 0; i < nbClub; i++){
            Club newClub = Club.RandomGeneration();

            for(int j = 0; j < nbPlayers; j++){
                newClub.players.add(Player.RandomGeneration());
            }

            for(int k = 0; k < nbCoach; k++){
                newClub.coaches.add(Coach.RandomGeneration());
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
