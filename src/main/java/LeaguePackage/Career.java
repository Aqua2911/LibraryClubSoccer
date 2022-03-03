package LeaguePackage;

import java.util.Date;

class Career {
    /**
     *
     *
     */
    String clubName;
    Date passageDate;

    Player player;

    public Career(String clubName, Date passageDate, Player player) {
        this.clubName = clubName;
        this.passageDate = passageDate;
        this.player = player;
    }
}
