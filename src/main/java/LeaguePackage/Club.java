package LeaguePackage;

import io.codearte.jfairy.Fairy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Club {
    /**
     *
     *
     */
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

    public static Club RandomGeneration(){
        Fairy fairy = Fairy.create();
        io.codearte.jfairy.producer.person.Person placeholder = fairy.person();
        String city = placeholder.getAddress().getCity();
        String name = city + "FC";
        String address = placeholder.getAddress().getAddressLine1();

        return new Club(name, "", "", new Date(), city, address);
    }
}
