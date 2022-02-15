import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class Ligue {

    private List<Club> clubs;
    private List<Entraineur> entraineurs;


    //Méthodes sur List<Club>
    public List<Club> getClubs() {
        return clubs;
    }

    public Club getClubByName(String clubName){
        return null;
    }

    public List<Joueur> getJoueursByClubName(String clubName){
        return getClubByName(clubName).getJoueurs();
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

    public void AddJoueurToClub(){

    }
    //Méthodes sur List<Joueur>
    public List<Parcours> getParcoursByJoueurName(String joueurName){
        return null;
    }

    //Méthodes sur List<Palmares>

    //Méthode sur List<Entraineur>
    public Entraineur MostTitledEntrainneur(){
        Entraineur mostTitledEntraineur = entraineurs.get(0);
        int mostTitledEntraineurSize = mostTitledEntraineur.getTitresGagnes().size();
        int size;
        for (Entraineur entraineur:entraineurs) {
            size = entraineur.getTitresGagnes().size();
            if(size > mostTitledEntraineurSize){
                mostTitledEntraineur = entraineur;
                mostTitledEntraineurSize = size;
            }
        }
        return mostTitledEntraineur;
    }


    //Méthodes sur List<Joueur> ET List<Club>
    public void TransactJoueurClub(String joueurName, String clubName){
    }

    //Méthodes CUD
    public void CreateClub(){

    }

    public void CreateEntraineur(){

    }

    public void CreateJoueur(){

    }

    public void CreatePalmares(){

    }

    public void CreateParcours(){

    }

    public void CreateStade(){

    }

    public void CreateStaff(){

    }

    public void CreateTitreGagne(){

    }

    public void DeleteClub(){

    }

    public void DeleteEntraineur(){

    }

    public void DeleteJoueur(){

    }

    public void DeletePalmares(){

    }

    public void DeleteParcours(){

    }

    public void DeleteStade(){

    }

    public void DeleteStaff(){

    }

    public void DeleteTitreGagne(){

    }

}
