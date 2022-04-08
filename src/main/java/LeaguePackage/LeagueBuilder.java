package LeaguePackage;

import java.util.Random;

public class LeagueBuilder implements ILeagueBuilder {

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
    public League buildXClubsRangePlayersRangeCoach(int nbClub, int minPlayer, int maxPlayer, int minCoach, int maxCoach) {
        League newLeague = new League();

        Random rng = new Random();
        int nbPlayersRng;
        int nbCoachRng;

        for(int i = 0; i < nbClub; i++){
            Club newClub = Club.RandomGeneration();

            nbPlayersRng = rng.nextInt(minPlayer, minPlayer);
            for(int j = 0; j < nbPlayersRng; j++){
                newClub.players.add(Player.RandomGeneration());
            }

            nbCoachRng = rng.nextInt(minCoach, maxCoach);
            for(int k = 0; k < nbCoachRng; k++){
                newClub.coaches.add(Coach.RandomGeneration());
            }

            newLeague.getClubs().add(newClub);
        }

        return newLeague;
    }
}
