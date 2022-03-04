package LeaguePackage;

import java.util.Date;

class TitleWon extends Palmares {

    public TitleWon(String title, Date obtainmentDate) {
        super(title, obtainmentDate);
    }

    @Override
    public String toString() {
        return "TitleWon{" +
                "titre='" + title + '\'' +
                ", obtainmentDate=" + obtainmentDate +
                '}';
    }
}
