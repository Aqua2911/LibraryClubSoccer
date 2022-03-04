package LeaguePackage;//import Personne.java;

import java.util.ArrayList;
import java.util.List;

class Player extends Person {
    /**
     *
     *
     */
    boolean independent;
    float height;
    float weight;
    String birthCity;

    List<Career> careers;

    public Player(String lastName, String firstName, float height, float weight, String birthCity) {
        super(lastName, firstName);
        this.independent = true;
        this.height = height;
        this.weight = weight;
        this.birthCity = birthCity;
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
}
