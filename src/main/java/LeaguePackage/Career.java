package LeaguePackage;

import java.util.Date;

class Career {
    /**
     *
     *
     */
    String clubName;
    Date passageDateStart;
    Date passageDateEnd;

    public Career(String clubName, Date passageDateStart, Date passageDateEnd) {
        this.clubName = clubName;
        this.passageDateStart = passageDateStart;
        this.passageDateEnd = passageDateEnd;
    }

    @Override
    public String toString() {
        return "Career{" +
                "clubName='" + clubName + '\'' +
                ", passageDateStart=" + passageDateStart +
                ", passageDateEnd=" + passageDateEnd +
                '}';
    }
}
