import java.util.Date;
import java.util.List;

public class Club {
    /**
     *
     *
     */
    //Attributs
    private String nom;



    private String histoire;
    private String couleur;
    private Date creationDate;
    private String ville;
    private String adresse;

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

    public List<Palmares> getPalmares() {
        return palmares;
    }

    public void setPalmares(List<Palmares> palmares) {
        this.palmares = palmares;
    }

    public Stade getStade() {
        return stade;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
