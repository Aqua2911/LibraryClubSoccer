package LeaguePackage;//import Personne.java;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;


/**
 * player is the class entity we'll be using to create a palyer, herit from class person
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName name, height, weight
 *  @return playerName, height, weight, stats
 *  @author Alpha, Kokou and  Nicolas ,
 */
class Player extends Person {
    /**
     *
     *
     */
    boolean independent;
    float height;
    float weight;
    String birthCity;
    float stats;

    List<Career> careers;

    public Player(String lastName, String firstName, float height, float weight, String birthCity, float stats) {
        super(lastName, firstName);
        this.independent = true;
        this.height = height;
        this.weight = weight;
        this.birthCity = birthCity;
        this.stats = stats;
        this.careers = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Player{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", independent=" + independent +
                ", height=" + height +
                ", weight=" + weight +
                ", birthCity='" + birthCity + '\'' +
                ", careers=" + careers +
                '}';
    }


    /**
     * RandomGeneration is the class entity we'll be using to generate by random a player
     *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
     *  user@baeldung:~$ mvn javadoc:javadoc
     *  @DisplayName name, height, weight, address
     *  @return playerName, height, weight, stats
     *  @author Alpha, Kokou and  Nicolas ,
     */

    public static Player RandomGeneration(){
        Random rng = new Random();
        Faker faker = new Faker();

        float height = rng.nextFloat( );
        float weight = rng.nextFloat( );
        float stats = rng.nextFloat();

        return new Player(faker.name().lastName(), faker.name().firstName(), height, weight, faker.address().city(), stats);
    }
}
