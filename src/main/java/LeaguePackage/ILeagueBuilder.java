package LeaguePackage;

public interface ILeagueBuilder {

    League buildXClubs(int nbClub);

    League buildXClubsYPlayers(int nbClub, int nbPlayers);

    League buildXClubsYPlayersZCoach(int nbClub, int nbPlayers, int nbCoach);

    League buildXClubsRangePlayersRangeCoach(int nbClub, int minPlayer, int maxPlayer, int minCoach, int maxCoach);
}
