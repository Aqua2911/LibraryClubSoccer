package LeaguePackage;//import Personne.java;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public static Player RandomGeneration(){
        Random rng = new Random();
        Faker faker = new Faker();

        float height = rng.nextFloat(5, 7);
        float weight = rng.nextFloat(100, 200);
        float stats = rng.nextFloat(0, 10);

        return new Player(faker.name().lastName(), faker.name().firstName(), height, weight, faker.address().city(), stats);
    }
}
