package LeaguePackage;

import io.codearte.jfairy.Fairy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public static Coach RandomGeneration(){
        Random rng = new Random();
        Fairy fairy = Fairy.create();
        io.codearte.jfairy.producer.person.Person placeholder = fairy.person();
        float statsMod = rng.nextFloat(0.5f, 2);

        return new Coach(placeholder.getLastName(), placeholder.getFirstName(), "N/A",statsMod);
    }
}
