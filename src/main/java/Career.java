import java.util.Date;

public class Career {
    /**
     *
     *
     */
    private String clubName;
    private Date passageDate;

    private Player player;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Date getPassageDate() {
        return passageDate;
    }

    public void setPassageDate(Date passageDate) {
        this.passageDate = passageDate;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
