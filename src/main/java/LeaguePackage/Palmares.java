package LeaguePackage;

import java.util.Date;

class Palmares {

    String title;
    Date obtainmentDate;

    public Palmares(String title, Date obtainmentDate) {
        this.title = title;
        this.obtainmentDate = obtainmentDate;
    }

    @Override
    public String toString() {
        return "Palmares{" +
                "titre='" + title + '\'' +
                ", dateObtention=" + obtainmentDate +
                '}';
    }
}
