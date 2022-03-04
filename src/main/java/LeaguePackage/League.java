package LeaguePackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class League {

    private final List<Club> clubs;
    private final List<Coach> coaches;
    private final List<Player> independentPlayers;

    //Constructor
    public League(){
        clubs = new ArrayList<>();
        coaches = new ArrayList<>();
        independentPlayers = new ArrayList<>();
    }

    //Méthodes sur List<Club>
    public List<Club> getClubs() {
        return clubs;
    }

    //Enter "INDEPENDENT" for players not affiliated with a club
    public List<Player> getPlayersByClubName(String clubName){
        if(Objects.equals(clubName, "INDEPENDENT"))
        {
            return independentPlayers;
        }
        return getClubByName(clubName).players;
    }

    public Club getClubByName(String clubName){
        for (Club club:clubs) {
            if(Objects.equals(club.name, clubName)){
                return club;
            }
        }
        return null;
    }

    public Player getPlayerByName(String firstName, String lastName){
        for (Club club:clubs) {
            for(Player player :club.players){
                if(player.firstName.equals(firstName) && player.lastName.equals(lastName))
                {
                    return player;
                }
            }
        }
        return null;
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

    //Méthodes sur List<Joueur>
    public List<Career> getCareerByPlayerName(String firstName, String lastName){
        return getPlayerByName(firstName, lastName).careers;
    }

    //Méthode sur List<Coach>
    public Coach getCoachByName(String firstName, String lastName){
        for(Coach coach :coaches){
            if(coach.firstName.equals(firstName) && coach.lastName.equals(lastName))
            {
                return coach;
            }
        }
        return null;
    }

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

    //Méthodes sur List<Player> ET List<Club>
    public void TransactPlayerClub(String playerFirstName, String playerLastName, String clubName){
        Player player = getPlayerByName(playerFirstName, playerLastName);
        Club club = getClubByName(clubName);
        if(player.independent){
            if(club == null){
                System.out.println("Player already independent");
                return;
            }
            else{
                player.independent = false;
            }
        }
        else{
            for (Club clubToChange:clubs) {
                clubToChange.players.removeIf(playerToChange -> playerToChange.equals(player));
            }
        }
        if(club == null){
            independentPlayers.add(player);
        }
        else {
            club.players.add(player);
        }
    }

    //Méthodes CUD
    public void CreateClub(String name, String history, String color, Date creationDate, String city, String address){
        clubs.add(new Club(name, history, color, creationDate, city, address));
    }

    public void CreateCoach(String lastName, String firstName, String gradePlace){
        coaches.add(new Coach(lastName, firstName, gradePlace));
    }

    public void CreatePlayer(String lastName, String firstName, float height, float weight, String birthCity){
        independentPlayers.add(new Player(lastName, firstName, height, weight, birthCity));
    }

    public void CreatePalmaresByClubName(String titre, Date dateObtention, String clubName){
        getClubByName(clubName).palmares.add(new Palmares(titre, dateObtention));
    }

    public void CreateCareersByPlayer(String firstname, String lastName,String clubName, Date passageDateStart, Date passageDateEnd){
        getPlayerByName(firstname, lastName).careers.add(new Career(clubName, passageDateStart, passageDateEnd));
    }

    public void CreateStadiumForClub(String clubName, String stadiumName, int capacity, String groundType){
        getClubByName(clubName).stadium = new Stadium(stadiumName, capacity, groundType);
    }

    public void CreateStaffForClub(String clubName, String firstName, String lastName, float age, String role){
        getClubByName(clubName).staffs.add(new Staff(firstName, lastName, age, role));
    }

    public void CreateTitleWonForCoach(String firstName, String lastName, String title, Date obtainmentDate){
        getCoachByName(firstName, lastName).titlesWon.add(new TitleWon(title, obtainmentDate));
    }

    public void DeleteClubByName(String clubName){
        Club clubToDelete = getClubByName(clubName);
        clubToDelete.staffs.clear();
        clubToDelete.palmares.clear();
        for(Coach coachToFired: clubToDelete.coaches){
            coachToFired.retired = true;
        }
        for(Player playerToFired: clubToDelete.players){
            TransactPlayerClub(playerToFired.firstName, playerToFired.lastName, "");
        }
        clubs.remove(clubToDelete);
    }

    public void DeleteCoach(String firstName, String lastName){
        Coach coachToDelete = getCoachByName(firstName, lastName);
        for(Club club: clubs){
            club.coaches.removeIf(coach -> coach.equals(coachToDelete));
        }
        coaches.remove(coachToDelete);
    }

    public void DeletePlayer(String firstName, String lastName){
        Player playerToDelete = getPlayerByName(firstName, lastName);
        if(playerToDelete.independent){
            independentPlayers.remove(playerToDelete);
        }
        else{
            for(Club club: clubs){
                club.players.removeIf(player -> player.equals(playerToDelete));
            }
        }
    }

    public void DeleteClubPalmares(String clubName){
        getClubByName(clubName).palmares.clear();
    }

    public void DeletePlayerCareers(String firstName, String Lastname){
        getPlayerByName(firstName, Lastname).careers.clear();
    }

    public void DeleteClubStadium(String clubName){
        getClubByName(clubName).stadium = null;
    }

    public void DeleteClubStaff(String clubName){
        getClubByName(clubName).staffs.clear();
    }

    public void DeleteCoachTitleWon(String firstname, String lastName){
        getCoachByName(firstname, lastName).titlesWon.clear();
    }

    @Override
    public String toString() {
        return "League{" +
                "clubs=" + clubs +
                ", coaches=" + coaches +
                ", independents players=" + independentPlayers +
                '}';
    }
}
