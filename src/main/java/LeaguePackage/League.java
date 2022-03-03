package LeaguePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class League {

    private List<Club> clubs;
    private List<Coach> coaches;

    //Constructor
    public League(){
        clubs = new ArrayList<>();
        coaches = new ArrayList<>();
    }


    //Méthodes sur List<Club>
    public List<Club> getClubs() {
        return clubs;
    }

    public Club getClubByName(String clubName){
        for (Club club:clubs) {
            if(Objects.equals(club.name, clubName)){
                return club;
            }
        }
        return null;
    }

    public List<Player> getPlayersByClubName(String clubName){
        return getClubByName(clubName).players;
    }

    //retourne le club de la ligue avec le plus de titres
    public Club MostTitledClub(){
        Club mostTitledClub = clubs.get(0);
        int mostTitledClubSize = mostTitledClub.palmares.size();
        int size;
        for (Club club:clubs) {
            size = club.palmares.size();
            if(size > mostTitledClubSize){
                mostTitledClub = club;
                mostTitledClubSize = size;
            }
        }
        return mostTitledClub;
    }

    public void AddPlayerToClub(Player player, String clubName){
        getClubByName(clubName).players.add(player);
    }

    //Méthodes sur List<Joueur>
    public List<Career> getCareerByPlayerName(String playerName){
        for (Club club:clubs) {
            for(Player player :club.players){
                if(player.lastName.equals(playerName))
                {
                    return player.careers;
                }
            }
        }
        return null;
    }

    //Méthodes sur List<LeaguePackage.Palmares>

    //Méthode sur List<LeaguePackage.Coach>
    public Coach MostTitledCoach(){
        Coach mostTitledCoach = coaches.get(0);
        int mostTitledCoachSize = mostTitledCoach.titlesWon.size();
        int size;
        for (Coach coach: coaches) {
            size = coach.titlesWon.size();
            if(size > mostTitledCoachSize){
                mostTitledCoach = coach;
                mostTitledCoachSize = size;
            }
        }
        return mostTitledCoach;
    }

    //Méthodes sur List<LeaguePackage.Player> ET List<LeaguePackage.Club>
    public void TransactPlayerClub(String playerName, String clubName){
    }

    //Méthodes CUD
    public void CreateClub(){
    }

    public void CreateCoach(){

    }

    public void CreatePlayer(){

    }

    public void CreatePalmares(){

    }

    public void CreateCareers(){

    }

    public void CreateStadium(){

    }

    public void CreateStaff(){

    }

    public void CreateTitleWon(){

    }

    public void DeleteClub(){

    }

    public void DeleteCoach(){

    }

    public void DeletePlayer(){

    }

    public void DeletePalmares(){

    }

    public void DeleteCareers(){

    }

    public void DeleteStadium(){

    }

    public void DeleteStaff(){

    }

    public void DeleteTitleWon(){

    }
}
