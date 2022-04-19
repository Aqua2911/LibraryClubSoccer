package LeaguePackage;

import java.util.Date;
/**
 * Palmares  is the class entity we'll be using to create Palmares
 *  Please see the {@link java.lang.Object} class for true identity   baeldung.com/javadoc
 *  user@baeldung:~$ mvn javadoc:javadoc
 *  @DisplayName title, obtainmentDate
 *  @return title, obtainmentDate
 *  @author Alpha, Kokou and  Nicolas ,
 */


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
