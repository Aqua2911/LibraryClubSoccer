//import Personne.java;

import java.util.List;

public class Joueur extends Personne {
    /**
     *
     *
     */
    private float taille;
    private float poids;
    private String villeNaissance;

    private Club club;
    private List<Parcours> parcours;

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
