package LeaguePackage;

import com.github.javafaker.Faker;

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
        Faker faker = new Faker();

        float statsMod = rng.nextFloat(0.5f, 2);

        return new Coach(faker.name().lastName(), faker.name().firstName(), faker.country().capital(),statsMod);
    }
}
