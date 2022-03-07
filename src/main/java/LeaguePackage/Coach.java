package LeaguePackage;

import java.util.ArrayList;
import java.util.List;

class Coach extends Person {
    /**
     *
     *
     */
    String gradePlace;
    float statsModifier;
    boolean retired;

    List<TitleWon> titlesWon;

    public Coach(String lastName, String firstName, String gradePlace, float statsModifier) {
        super(lastName, firstName);
        this.gradePlace = gradePlace;
        this.statsModifier = statsModifier;
        this.retired = false;
        this.titlesWon = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "{" + firstName + ' ' + lastName + '}';
    }

    public String toStringDetails() {
        return "Coach{" +
                "gradePlace='" + gradePlace + '\'' +
                ", titlesWon=" + titlesWon +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
