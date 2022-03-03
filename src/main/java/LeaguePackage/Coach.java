package LeaguePackage;

import java.util.ArrayList;
import java.util.List;

class Coach extends Person {
    /**
     *
     *
     */
    String gradePlace;
    Stadium stadium;

    List<TitleWon> titlesWon;

    public Coach(String lastName, String firstName, String gradePlace, Stadium stadium) {
        super(lastName, firstName);
        this.gradePlace = gradePlace;
        this.stadium = stadium;
        this.titlesWon = new ArrayList<>();
    }
}
