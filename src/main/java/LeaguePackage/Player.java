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

    Club club;

    List<Career> careers;

    public Player(String lastName, String firstName, boolean independent, float height, float weight, String birthCity, Club club) {
        super(lastName, firstName);
        this.independent = independent;
        this.height = height;
        this.weight = weight;
        this.birthCity = birthCity;
        this.club = club;
        this.careers = new ArrayList<>();
    }
}
