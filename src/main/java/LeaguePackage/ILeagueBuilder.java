package LeaguePackage;

public interface ILeagueBuilder {

    League buildXClubs(int nbClub);

    League buildXClubsYPlayers(int nbClub, int nbPlayers);

    League buildXClubsYPlayersZCoach(int nbClub, int nbPlayers, int nbCoach);

    League buildXClubsRangeCoachRangePlayers(int nbClub, int minCoach, int maxCoach, int minPlayer, int maxPlayer);
}
