import java.util.List;

public class League {

    private List<Club> clubs;
    private List<Coach> coaches;


    //Méthodes sur List<Club>
    public List<Club> getClubs() {
        return clubs;
    }

    public Club getClubByName(String clubName){
        return null;
    }

    public List<Player> getPlayersByClubName(String clubName){
        return getClubByName(clubName).getPlayers();
    }

    //retourne le club de la ligue avec le plus de titres
    public Club MostTitledClub(){
        Club mostTitledClub = clubs.get(0);
        int mostTitledClubSize = mostTitledClub.getPalmares().size();
        int size;
        for (Club club:clubs) {
            size = club.getPalmares().size();
            if(size > mostTitledClubSize){
                mostTitledClub = club;
                mostTitledClubSize = size;
            }
        }
        return mostTitledClub;
    }

    public void AddPlayerToClub(Player player, String clubName){
        getClubByName(clubName).getPlayers().add(player);
    }

    //Méthodes sur List<Joueur>
    public List<Career> getCareerByPlayerName(String playerName){
        for (Club club:clubs) {
            for(Player player :club.getPlayers()){
                if(player.getLastName().equals(playerName))
                {
                    return player.getCareers();
                }
            }
        }
        return null;
    }

    //Méthodes sur List<Palmares>

    //Méthode sur List<Entraineur>
    public Coach MostTitledEntrainneur(){
        Coach mostTitledEntraineur = coaches.get(0);
        int mostTitledEntraineurSize = mostTitledEntraineur.getTitlesWon().size();
        int size;
        for (Coach coach: coaches) {
            size = coach.getTitlesWon().size();
            if(size > mostTitledEntraineurSize){
                mostTitledEntraineur = coach;
                mostTitledEntraineurSize = size;
            }
        }
        return mostTitledEntraineur;
    }


    //Méthodes sur List<Player> ET List<Club>
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
