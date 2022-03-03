import java.util.Date;
import java.util.List;

public class Club {
    /**
     *
     *
     */
    //Attributs
    private String name;
    private String history;
    private String color;
    private Date creationDate;
    private String city;
    private String address;

    private Stadium stadium;

    private List<Player> players;
    private List<Staff> staffs;
    private List<Coach> coaches;
    private List<Palmares> palmares;

    //Getters
    public String getName() {
        return name;
    }

    public String getHistory() {
        return history;
    }

    public String getColor() {
        return color;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Palmares> getPalmares() {
        return palmares;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setPalmares(List<Palmares> palmares) {
        this.palmares = palmares;
    }












}
