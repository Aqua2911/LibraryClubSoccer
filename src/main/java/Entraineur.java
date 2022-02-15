import java.util.List;

public class Entraineur extends Personne{
    /**
     *
     *
     */
    private String lieuGrade;

    private Stade stade;

    public List<TitreGagne> getTitresGagnes() {
        return titresGagnes;
    }

    public void setTitresGagnes(List<TitreGagne> titresGagnes) {
        this.titresGagnes = titresGagnes;
    }

    private List<TitreGagne> titresGagnes;

    //Getters
    public String getLieuGrade() {
        return lieuGrade;
    }

    public Stade getStade() {
        return stade;
    }

    //Setters
    public void setLieuGrade(String lieuGrade) {
        this.lieuGrade = lieuGrade;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }
}
