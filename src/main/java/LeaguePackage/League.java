package LeaguePackage;

import java.util.*;

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

    //Getter de la liste des clubs
    public List<Club> getClubs() {
        return clubs;
    }

    //Tout les joueurs faisant partie d'un certain club
    //Enter "INDEPENDENT" for players not affiliated with a club
    //IMPORTANT : aucune vérification que le club est non null. À MODIFIER
    public List<Player> getPlayersByClubName(String clubName){
        if(Objects.equals(clubName, "INDEPENDENT"))
        {
            //retourne les joueurs indépendants
            return independentPlayers;
        }
        return getClubByName(clubName).players;
    }

    //Retourne le club ayant un certain nom
    public Club getClubByName(String clubName){
        for (Club club:clubs) {
            if(Objects.equals(club.name, clubName)){
                return club;
            }
        }
        return null;
    }

    //Retourne le Joueur ayant un certain nom
    public Player getPlayerByName(String firstName, String lastName){
        for (Club club:clubs) {
            for(Player player :club.players){
                if(player.firstName.equals(firstName) && player.lastName.equals(lastName))
                {
                    return player;
                }
            }
        }
        for(Player player: independentPlayers){
            if(player.firstName.equals(firstName) && player.lastName.equals(lastName))
            {
                return player;
            }
        }
        return null;
    }

    //retourne le club avec le plus de titres
    public String mostTitledClub(){
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
        return mostTitledClub.toString();
    }

    //Retourne le parcours d'un certain joueur
    //IMPORTANT : aucune vérification que le joueur est non null. À MODIFIER
    public List<Career> getCareerByPlayerName(String firstName, String lastName){
        return getPlayerByName(firstName, lastName).careers;
    }

    //Retourne un certain coach
    public Coach getCoachByName(String firstName, String lastName){
        for(Coach coach :coaches){
            if(coach.firstName.equals(firstName) && coach.lastName.equals(lastName))
            {
                return coach;
            }
        }
        return null;
    }

    //Retourne le coach avec le plus de titres
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

    //Déplace un joueur entre deux clubs
    //Si le club est null, déplace vers la liste des joueurs indépendants
    public void transactPlayerClub(String playerFirstName, String playerLastName, String clubName){
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

    //Méthodes De Création et de Suppression d'objets.
    public void createClub(String name, String history, String color, Date creationDate, String city, String address){
        clubs.add(new Club(name, history, color, creationDate, city, address));
    }

    public void createCoach(String lastName, String firstName, String gradePlace, float statsModifier){
        coaches.add(new Coach(lastName, firstName, gradePlace, statsModifier));
    }

    public void createPlayer(String lastName, String firstName, float height, float weight, String birthCity, float stats){
        independentPlayers.add(new Player(lastName, firstName, height, weight, birthCity, stats));
    }

    public void createPalmaresByClubName(String titre, Date dateObtention, String clubName){
        getClubByName(clubName).palmares.add(new Palmares(titre, dateObtention));
    }

    public void createCareersByPlayer(String firstname, String lastName,String clubName, Date passageDateStart, Date passageDateEnd){
        getPlayerByName(firstname, lastName).careers.add(new Career(clubName, passageDateStart, passageDateEnd));
    }

    public void createStadiumForClub(String clubName, String stadiumName, int capacity, String groundType){
        getClubByName(clubName).stadium = new Stadium(stadiumName, capacity, groundType);
    }

    public void createStaffForClub(String clubName, String firstName, String lastName, float age, String role){
        getClubByName(clubName).staffs.add(new Staff(firstName, lastName, age, role));
    }

    public void createTitleWonForCoach(String firstName, String lastName, String title, Date obtainmentDate){
        getCoachByName(firstName, lastName).titlesWon.add(new TitleWon(title, obtainmentDate));
    }

    //Supprime un club, son staff et son palmares. Place les coaches en retraite (non supprimés) et les joueurs en indépendants
    public void deleteClubByName(String clubName){
        Club clubToDelete = getClubByName(clubName);
        clubToDelete.staffs.clear();
        clubToDelete.palmares.clear();
        for(Coach coachToFired: clubToDelete.coaches){
            coachToFired.retired = true;
        }
        for(Player playerToFired: clubToDelete.players){
            transactPlayerClub(playerToFired.firstName, playerToFired.lastName, "");
        }
        clubs.remove(clubToDelete);
    }

    //Supprime un coach. Cherche sa position (dans un club ou retraité)
    public void deleteCoach(String firstName, String lastName){
        Coach coachToDelete = getCoachByName(firstName, lastName);
        for(Club club: clubs){
            club.coaches.removeIf(coach -> coach.equals(coachToDelete));
        }
        coaches.remove(coachToDelete);
    }

    //Supprime un Joueur. Cherche dans un club ou indépendant
    public void deletePlayer(String firstName, String lastName){
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

    public void deleteClubPalmares(String clubName){
        getClubByName(clubName).palmares.clear();
    }

    public void deletePlayerCareers(String firstName, String Lastname){
        getPlayerByName(firstName, Lastname).careers.clear();
    }

    public void deleteClubStadium(String clubName){
        getClubByName(clubName).stadium = null;
    }

    public void deleteClubStaff(String clubName){
        getClubByName(clubName).staffs.clear();
    }

    public void deleteCoachTitleWon(String firstname, String lastName){
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
