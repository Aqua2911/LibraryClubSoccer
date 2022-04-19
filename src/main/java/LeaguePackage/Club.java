package LeaguePackage;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * club is the class entity we'll be using to create a club
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName name
 *  @return clubName
 *  @author Alpha, Kokou and  Nicolas ,
 */

class Club {
    //Attributs
    String name;
    String history;
    String color;
    Date creationDate;
    String city;
    String address;

    Stadium stadium;

    List<Player> players;
    List<Staff> staffs;
    List<Coach> coaches;
    List<Palmares> palmares;

    public Club(String name, String history, String color, Date creationDate, String city, String address) {
        this.name = name;
        this.history = history;
        this.color = color;
        this.creationDate = creationDate;
        this.city = city;
        this.address = address;
        this.stadium = null;
        this.players = new ArrayList<>();
        this.staffs = new ArrayList<>();
        this.coaches = new ArrayList<>();
        this.palmares = new ArrayList<>();
    }

    //Simulation de "force" d'un club. Additionne les forces individuelles des Joueurs
    //et multiplie le tout par l'addition des multiplicateurs des coaches


    /**
     * getStats is the class entity we'll be using to get statists of any players and strengh of club
     *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
     *  user@baeldung:~$ mvn javadoc:javadoc
     *  @DisplayName name
     *  @return clubName
     *  @author Alpha, Kokou and  Nicolas ,
     */


    public float getStats(){
        float statsPlayers = 0;
        float statsModifier = 1;

        for(Player player: players){
            statsPlayers += player.stats;
        }

        for(Coach coach: coaches){
            statsModifier += coach.statsModifier - 1;
        }

        return statsPlayers * statsModifier;
    }

    @Override
    public String toString() {
        return "{" + name + '}';
    }

    public String toStringDetails() {
        return "Club{" +
                "name='" + name + '\'' +
                ", history='" + history + '\'' +
                ", color='" + color + '\'' +
                ", creationDate=" + creationDate +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", stadium=" + stadium +
                ", players=" + players +
                ", staffs=" + staffs +
                ", coaches=" + coaches +
                ", palmares=" + palmares +
                '}';
    }

    /**
     * Club RandomGeneration is the class entity we'll be using to get random Generation of club
     *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
     *  user@baeldung:~$ mvn javadoc:javadoc
     *  @DisplayName name
     *  @return clubName
     *  @author Alpha, Kokou and  Nicolas ,
     */

    public static Club RandomGeneration(){
        Faker faker = new Faker();

        String city = faker.address().city();
        String name = city + "FC";

        return new Club(name, faker.lorem().sentence(15), faker.color().name(), new Date(), city, faker.address().streetAddress());
    }
}
