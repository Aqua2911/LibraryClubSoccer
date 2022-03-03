import java.util.List;

public class Coach extends Person {
    /**
     *
     *
     */
    private String gradePlace;
    private Stadium stadium;

    private List<TitleWon> titlesWon;

    //Getters
    public String getGradePlace() {
        return gradePlace;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public List<TitleWon> getTitlesWon() {
        return titlesWon;
    }

    //Setters
    public void setGradePlace(String gradePlace) {
        this.gradePlace = gradePlace;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public void setTitlesWon(List<TitleWon> titlesWon) {
        this.titlesWon = titlesWon;
    }
}
