package LeaguePackage;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Coach is the class entity we'll be using to create a Coach, herit from class person
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName lastName, firstName, titlesWon
 *  @return lastName, firstName, titlesWon , retired or not , gradePlace
 *  @author Alpha, Kokou and  Nicolas ,
 */


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


    /**
     * Coach RandomGeneration is the class entity we'll be using to generate Coach statistics
     *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
     *  user@baeldung:~$ mvn javadoc:javadoc
     *  @DisplayName lastName, firstName
     *  @return lastName, firstName, country , capital , statsMod
     *  @author Alpha, Kokou and  Nicolas ,
     */
    public static Coach RandomGeneration(){
        Random rng = new Random();
        Faker faker = new Faker();

        float statsMod = rng.nextFloat();

        return new Coach(faker.name().lastName(), faker.name().firstName(), faker.country().capital(),statsMod);
    }
}
