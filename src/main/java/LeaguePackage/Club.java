package LeaguePackage;

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

    public Club(String name, String history, String color, Date creationDate, String city, String address, Stadium stadium) {
        this.name = name;
        this.history = history;
        this.color = color;
        this.creationDate = creationDate;
        this.city = city;
        this.address = address;
        this.stadium = stadium;
        this.players = new ArrayList<>();
        this.staffs = new ArrayList<>();
        this.coaches = new ArrayList<>();
        this.palmares = new ArrayList<>();
    }
}
