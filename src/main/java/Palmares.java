import java.util.Date;

public class Palmares {

    private String titre;



    private Date dateObtention;

    private Club club;

    /**
     *
     */
    public String getTitre() {
        return titre;
    }

    /**
     *
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     *
     */
    public Date getDateObtention() {
        return dateObtention;
    }

    /**
     *
     */
    public void setDateObtention(Date dateObtention) {
        this.dateObtention = dateObtention;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
