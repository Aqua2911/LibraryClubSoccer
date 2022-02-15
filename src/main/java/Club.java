import java.util.Date;
import java.util.List;

public class Club {
    /**
     *
     *
     */
    //Attributs
    public String histoire;
    public String couleur;
    public Date creationDate;
    public String ville;
    public String adresse;

    private Stade stade;

    private List<Joueur> joueurs;
    private List<Staff> staffs;
    private List<Entraineur> entraineurs;
    private List<Palmares> palmares;

    //Getters
    public String getHistoire() {
        return histoire;
    }

    public String getCouleur() {
        return couleur;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getVille() {
        return ville;
    }

    public String getAdresse() {
        return adresse;
    }

    //Setters
    public void setHistoire(String histoire) {
        this.histoire = histoire;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
